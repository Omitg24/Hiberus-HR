<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui"%>

<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ taglib prefix="liferay-item-selector" uri="http://liferay.com/tld/item-selector"%>
<%@ taglib prefix="liferay-frontend" uri="http://liferay.com/tld/frontend"%>
<%@ taglib prefix="liferay-portlet"	uri="http://liferay.com/tld/portlet"%>
<%@ taglib prefix="liferay-theme" uri="http://liferay.com/tld/theme"%>
<%@ taglib prefix="liferay-ui" uri="http://liferay.com/tld/ui"%>

<%@ page import="com.liferay.web.constants.MVCCommandNames"%>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%
 String backURL = ParamUtil.getString(request, "backURL");
%>

<liferay-frontend:defineObjects />

<liferay-theme:defineObjects />

<portlet:defineObjects />