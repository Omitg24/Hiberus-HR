package com.liferay.web.portlet.util;

import com.liferay.journal.model.JournalArticle;
import com.liferay.portal.kernel.xml.Document;
import com.liferay.portal.kernel.xml.DocumentException;
import com.liferay.portal.kernel.xml.Node;
import com.liferay.portal.kernel.xml.SAXReaderUtil;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class ArticleUtils {

	public static List<Hosting> extractHostings(List<JournalArticle> articles) {
		List<Hosting> hostings = new ArrayList<Hosting>();
		try {
			for (JournalArticle article : articles) {
				String content = article.getContent();

				Document document = SAXReaderUtil.read(new StringReader(content));

				long id = article.getId();
				String name = checkNode(
						document.selectSingleNode("root//dynamic-element[@field-reference='Nombre']/dynamic-content"));
				double roomPrice = Double.parseDouble(checkNode(document
						.selectSingleNode("root//dynamic-element[@field-reference='PrecioHab']/dynamic-content")));

				List<Node> nodes = document.selectNodes(
						"root//dynamic-element[@field-reference='Servicios']//dynamic-element[@field-reference='Servicio']//dynamic-element[@field-reference='PrecioServicio']/dynamic-content");
				double servicesTotalPrice = 0;
				for (Node service : nodes) {
					servicesTotalPrice += Double.parseDouble(checkNode(service));
				}

				hostings.add(new Hosting(id, name, roomPrice, servicesTotalPrice));
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return hostings;
	}
	
	public static Hosting extractHostingData(JournalArticle article) {
		Hosting hosting = new Hosting();
		try {
			String content = article.getContent();

			Document document = SAXReaderUtil.read(new StringReader(content));

			long id = article.getId();
			String name = checkNode(
					document.selectSingleNode("root//dynamic-element[@field-reference='Nombre']/dynamic-content"));
			double roomPrice = Double.parseDouble(checkNode(document
					.selectSingleNode("root//dynamic-element[@field-reference='PrecioHab']/dynamic-content")));

			List<Node> nodes = document.selectNodes(
					"root//dynamic-element[@field-reference='Servicios']//dynamic-element[@field-reference='Servicio']//dynamic-element[@field-reference='PrecioServicio']/dynamic-content");
			double servicesTotalPrice = 0;
			for (Node service : nodes) {
				servicesTotalPrice += Double.parseDouble(checkNode(service));
			}

			hosting.setId(id);
			hosting.setName(name);
			hosting.setRoomPrice(roomPrice);
			hosting.setServicesTotalPrice(servicesTotalPrice);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return hosting;
	}

	private static String checkNode(Node node) {
		return (node != null && node.hasContent() && !node.getText().isEmpty()) ? node.getText() : "-1";
	}
}
