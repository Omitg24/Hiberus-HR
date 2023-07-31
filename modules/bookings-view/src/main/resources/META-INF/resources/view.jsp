<%@ page import="com.liferay.web.constants.MVCCommandNames"%>
<%@ page import="java.util.List"%>
<%@ page import="com.liferay.model.Reserva"%>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@ include file="/init.jsp"%>


<div class="container-fluid-1200">
	<liferay-ui:header title="bookingsview.list"></liferay-ui:header>
	<div class="d-flex justify-content-between">
		<div>
			<table class="table table-bordered">
				<tr>
					<th scope="row"><liferay-ui:message key="bookingsview.totalBookings"/></th>
					<td scope="row"><%=request.getAttribute("bookingsSize")%></td>
				</tr>
			</table>
		</div>
		<portlet:renderURL var="addURL">
			<portlet:param name="mvcRenderCommandName"
				value="<%=MVCCommandNames.ADD_BOOKING%>" />
			<portlet:param name="backURL"
				value="<%=PortalUtil.getCurrentURL(request)%>" />
		</portlet:renderURL>
		<aui:button value="bookingsview.addButton" href="${addURL}"></aui:button>
	</div>
	<liferay-ui:search-container
		emptyResultsMessage="No existen reservas disponibles"
		headerNames="Nombre, Apellidos, Email, Fecha de entrada, Fecha de salida, Nº de habitaciones, Nº de personas, Ver, Editar, Eliminar">
		<liferay-ui:search-container-results
			results="<%=(List<Reserva>) request.getAttribute("bookingsList")%>" />
		<liferay-ui:search-container-row className="com.liferay.model.Reserva"
			keyProperty="idReserva" modelVar="booking">
			<liferay-ui:search-container-column-text name="bookingsview.nombre"
				property="nombre" />
			<liferay-ui:search-container-column-text name="bookingsview.apellidos"
				property="apellidos" />
			<liferay-ui:search-container-column-text name="bookingsview.email"
				property="email" />
			<liferay-ui:search-container-column-text name="bookingsview.fechaEntrada"
				property="fechaEntrada" />
			<liferay-ui:search-container-column-text name="bookingsview.fechaSalida"
				property="fechaSalida" />
			<liferay-ui:search-container-column-text name="bookingsview.alojamiento"
				property="idAlojamiento" />
			<liferay-ui:search-container-column-text name="bookingsview.habitaciones"
				property="habitaciones" />
			<liferay-ui:search-container-column-text name="bookingsview.personas"
				property="personas" />
			<liferay-ui:search-container-column-text cssClass="text-center">
				<portlet:renderURL var="viewURL">
					<portlet:param name="mvcRenderCommandName"
						value="<%=MVCCommandNames.VIEW_BOOKING%>" />
					<portlet:param name="backURL"
						value="<%=PortalUtil.getCurrentURL(request)%>" />
					<portlet:param name="idReserva" value="${booking.idReserva}" />
				</portlet:renderURL>
				<aui:button value="bookingsview.viewButton" href="${viewURL}"></aui:button>
			</liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text cssClass="text-center">
				<portlet:renderURL var="editURL">
					<portlet:param name="mvcRenderCommandName"
						value="<%=MVCCommandNames.EDIT_BOOKING%>" />
					<portlet:param name="backURL"
						value="<%=PortalUtil.getCurrentURL(request)%>" />
					<portlet:param name="idReserva" value="${booking.idReserva}" />
				</portlet:renderURL>
				<aui:button value="bookingsview.editButton" href="${editURL}"></aui:button>
			</liferay-ui:search-container-column-text>
			<liferay-ui:search-container-column-text cssClass="text-center">
				<portlet:actionURL var="deleteURL"
					name="<%=MVCCommandNames.DELETE_BOOKING%>">
					<portlet:param name="idReserva" value="${booking.idReserva}" />
				</portlet:actionURL>
				<aui:button value="bookingsview.deleteButton" href="${deleteURL}"></aui:button>
			</liferay-ui:search-container-column-text>
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator searchContainer="${searchContainer}" />
	</liferay-ui:search-container>
</div>