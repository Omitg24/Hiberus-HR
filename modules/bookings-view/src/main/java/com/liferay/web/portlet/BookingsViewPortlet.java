package com.liferay.web.portlet;

import com.liferay.model.Reserva;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.service.ReservaLocalServiceUtil;
import com.liferay.web.constants.BookingsViewPortletKeys;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author oteixeira
 */
@Component(
		immediate = true, 
		property = { 
				"com.liferay.portlet.display-category=category.sample",
				"com.liferay.portlet.instanceable=false", 
				"javax.portlet.init-param.template-path=/",
				"javax.portlet.init-param.view-template=/view.jsp",
				"javax.portlet.name=" + BookingsViewPortletKeys.BOOKINGSVIEW, 
				"javax.portlet.resource-bundle=content.Language",
				"javax.portlet.security-role-ref=power-user,user",
				"javax.portlet.init-param.add-process-action-success-action=false"
		},
		service = Portlet.class
	)
public class BookingsViewPortlet extends MVCPortlet {

	private static final Log _log = LogFactoryUtil.getLog(BookingsViewPortlet.class);
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		List<Reserva> bookingsList = ReservaLocalServiceUtil.getReservas(0,  Integer.MAX_VALUE);

		if (_log.isInfoEnabled()) {
			_log.info("Invoking #render(RenderRequest, RenderResponse)");
		}		
		
		renderRequest.setAttribute("bookingsSize", ReservaLocalServiceUtil.getReservasCount());
		renderRequest.setAttribute("bookingsList", bookingsList);

		super.render(renderRequest, renderResponse);
	}
}