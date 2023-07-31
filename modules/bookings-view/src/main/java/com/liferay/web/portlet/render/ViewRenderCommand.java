package com.liferay.web.portlet.render;

import com.liferay.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.model.Reserva;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.service.ReservaLocalServiceUtil;
import com.liferay.web.constants.BookingsViewPortletKeys;
import com.liferay.web.constants.MVCCommandNames;
import com.liferay.web.portlet.util.ArticleUtils;
import com.liferay.web.portlet.util.Hosting;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + BookingsViewPortletKeys.BOOKINGSVIEW,
		"mvc.command.name=" + MVCCommandNames.VIEW_BOOKING }, service = MVCRenderCommand.class)
public class ViewRenderCommand implements MVCRenderCommand {

	private static final Log _log = LogFactoryUtil.getLog(ViewRenderCommand.class);

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		if (_log.isInfoEnabled()) {
			_log.info("Invoking #render(RenderRequest, RenderResponse)");
		}

		try {
			long idReserva = ParamUtil.getLong(renderRequest, "idReserva");
			Reserva booking = ReservaLocalServiceUtil.getReserva(idReserva);
			long idAlojamiento = booking.getIdAlojamiento();
			Hosting hosting = ArticleUtils.extractHostingData(JournalArticleLocalServiceUtil.getArticle(idAlojamiento));
			ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
			int vatRate = Integer.parseInt(GroupLocalServiceUtil.getGroup(themeDisplay.getScopeGroupId())
					.getExpandoBridge().getAttribute("VAT rate").toString());
			double basePrice = ((hosting.getRoomPrice() + hosting.getServicesTotalPrice()) * booking.getHabitaciones());
			double vatRateIncrement = basePrice * vatRate / 100;
			double totalPrice = basePrice + vatRateIncrement;

			renderRequest.setAttribute("booking", booking);
			renderRequest.setAttribute("hosting", hosting);
			renderRequest.setAttribute("totalPrice", Math.round(totalPrice * 100.0) / 100.0);
			return "/booking/view.jsp";
		} catch (PortalException e) {
			_log.error(e);
		}
		return "/view.jsp";
	}

}
