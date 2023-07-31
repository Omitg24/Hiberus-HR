package com.liferay.web.portlet.render;

import com.liferay.journal.service.JournalArticleServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.web.constants.BookingsViewPortletKeys;
import com.liferay.web.constants.MVCCommandNames;
import com.liferay.web.portlet.util.ArticleUtils;
import com.liferay.web.portlet.util.Hosting;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + BookingsViewPortletKeys.BOOKINGSVIEW,
		"mvc.command.name=" + MVCCommandNames.CONFIRM_BOOKING }, service = MVCRenderCommand.class)
public class ConfirmRenderCommand implements MVCRenderCommand {

	private static final Log _log = LogFactoryUtil.getLog(ConfirmRenderCommand.class);

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		try {
			String nombre = ParamUtil.getString(renderRequest, "nombre");
			String apellidos = ParamUtil.getString(renderRequest, "apellidos");
			String email = ParamUtil.getString(renderRequest, "email");
			String fechaEntrada = ParamUtil.getString(renderRequest, "fechaEntrada");
			String fechaSalida = ParamUtil.getString(renderRequest, "fechaSalida");
			int habitaciones = ParamUtil.getInteger(renderRequest, "habitaciones");
			int personas = ParamUtil.getInteger(renderRequest, "personas");
			long idAlojamiento = ParamUtil.getLong(renderRequest, "idAlojamiento");

			Hosting hosting = ArticleUtils.extractHostingData(JournalArticleServiceUtil.getArticle(idAlojamiento));

			ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
			int vatRate = Integer.parseInt(GroupLocalServiceUtil.getGroup(themeDisplay.getScopeGroupId())
					.getExpandoBridge().getAttribute("VAT rate").toString());
			double basePrice = ((hosting.getRoomPrice() + hosting.getServicesTotalPrice()) * habitaciones);
			double vatRateIncrement = basePrice * vatRate / 100;
			double totalPrice = basePrice + vatRateIncrement;

			renderRequest.setAttribute("nombre", nombre);
			renderRequest.setAttribute("apellidos", apellidos);
			renderRequest.setAttribute("email", email);
			renderRequest.setAttribute("fechaEntrada", fechaEntrada);
			renderRequest.setAttribute("fechaSalida", fechaSalida);
			renderRequest.setAttribute("habitaciones", habitaciones);
			renderRequest.setAttribute("personas", personas);
			renderRequest.setAttribute("hosting", hosting);
			renderRequest.setAttribute("totalPrice", Math.round(totalPrice * 100.0) / 100.0);
		} catch (PortalException e) {
			_log.error(e);
		}
		return "/booking/confirmation.jsp";
	}

}
