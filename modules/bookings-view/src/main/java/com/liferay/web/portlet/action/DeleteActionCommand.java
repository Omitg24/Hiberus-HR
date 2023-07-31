package com.liferay.web.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.service.ReservaLocalServiceUtil;
import com.liferay.web.constants.BookingsViewPortletKeys;
import com.liferay.web.constants.MVCCommandNames;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + BookingsViewPortletKeys.BOOKINGSVIEW,
		"mvc.command.name=" + MVCCommandNames.DELETE_BOOKING }, service = MVCActionCommand.class)
public class DeleteActionCommand implements MVCActionCommand {

	private static final Log _log = LogFactoryUtil.getLog(DeleteActionCommand.class);

	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		if (_log.isInfoEnabled()) {
			_log.info("Invoking #action(ActionRequest, ActionResponse)");
		}

		try {
			long idReserva = ParamUtil.getLong(actionRequest, "idReserva");

			ReservaLocalServiceUtil.deleteReserva(idReserva);
			return true;
		} catch (PortalException e) {
			_log.error(e);
		}
		return false;
	}
}
