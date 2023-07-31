package com.liferay.web.portlet.render;

import com.liferay.journal.model.JournalArticle;
import com.liferay.journal.service.JournalArticleLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.web.constants.BookingsViewPortletKeys;
import com.liferay.web.constants.MVCCommandNames;
import com.liferay.web.portlet.util.ArticleUtils;
import com.liferay.web.portlet.util.Hosting;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + BookingsViewPortletKeys.BOOKINGSVIEW,
		"mvc.command.name=" + MVCCommandNames.ADD_BOOKING }, service = MVCRenderCommand.class)
public class AddRenderCommand implements MVCRenderCommand {

	private static final Log _log = LogFactoryUtil.getLog(AddRenderCommand.class);

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		if (_log.isInfoEnabled()) {
			_log.info("Invoking #render(RenderRequest, RenderResponse)");
		}		
		
		try {
			
			List<JournalArticle> articles = new ArrayList<>();
			for (JournalArticle article : JournalArticleLocalServiceUtil.getArticles()) {
				if (!articles.stream().anyMatch(a -> a.getUrlTitle().equals(article.getUrlTitle()))) {
					articles.add(JournalArticleLocalServiceUtil.getLatestArticle(article.getResourcePrimKey()));
				}
			}
			
			List<Hosting> hostings = ArticleUtils.extractHostings(articles);
			_log.info(hostings);

			renderRequest.setAttribute("hostings", hostings);
			return "/booking/add.jsp";
		} catch (PortalException e) {
			_log.error(e);
		}

		return "/view.jsp";
	}
}
