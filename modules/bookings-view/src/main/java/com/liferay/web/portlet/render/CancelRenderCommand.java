package com.liferay.web.portlet.render;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.web.constants.BookingsViewPortletKeys;
import com.liferay.web.constants.MVCCommandNames;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + BookingsViewPortletKeys.BOOKINGSVIEW,
		"mvc.command.name=" + MVCCommandNames.CANCEL_BOOKING }, service = MVCRenderCommand.class)
public class CancelRenderCommand implements MVCRenderCommand {

	private static final Log _log = LogFactoryUtil.getLog(AddRenderCommand.class);

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		if (_log.isInfoEnabled()) {
			_log.info("Invoking #render(RenderRequest, RenderResponse)");
		}

		return "/view.jsp";
	}
}
