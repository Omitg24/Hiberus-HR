package com.liferay.web.portlet.action;

import com.liferay.exception.BookingValidationException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.service.ReservaLocalServiceUtil;
import com.liferay.web.constants.BookingsViewPortletKeys;
import com.liferay.web.constants.MVCCommandNames;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + BookingsViewPortletKeys.BOOKINGSVIEW,
		"mvc.command.name=" + MVCCommandNames.ADD_BOOKING }, service = MVCActionCommand.class)
public class AddActionCommand implements MVCActionCommand {

	private static final Log _log = LogFactoryUtil.getLog(AddActionCommand.class);

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		if (_log.isInfoEnabled()) {
			_log.info("Invoking #action(ActionRequest, ActionResponse)");
		}

		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			long groupId = themeDisplay.getSiteGroupId();
			String nombre = ParamUtil.getString(actionRequest, "nombre");
			String apellidos = ParamUtil.getString(actionRequest, "apellidos");
			String email = ParamUtil.getString(actionRequest, "email");
			String fechaEntrada = ParamUtil.getString(actionRequest, "fechaEntrada");
			String fechaSalida = ParamUtil.getString(actionRequest, "fechaSalida");
			int habitaciones = ParamUtil.getInteger(actionRequest, "habitaciones");
			int personas = ParamUtil.getInteger(actionRequest, "personas");
			long idAlojamiento = ParamUtil.getLong(actionRequest, "idAlojamiento");

			ReservaLocalServiceUtil.addReserva(groupId, nombre, apellidos, email, idAlojamiento,
					new SimpleDateFormat("yyyy-MM-dd").parse(fechaEntrada),
					new SimpleDateFormat("yyyy-MM-dd").parse(fechaSalida), habitaciones, personas, serviceContext);
			return true;
		} catch (BookingValidationException e) {
			e.getErrors().forEach(error -> SessionErrors.add(actionRequest, error));
		} catch (PortalException e) {
			_log.error(e);
		} catch (ParseException e) {
			_log.error(e);
		}
		return false;
	}
}
