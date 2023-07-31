<%@ include file="../init.jsp"%>

<div id="popup-content" class="container-fluid">
	<div class="card">
		<div class="card-body">
			<div class="card-title">
				<h3><liferay-ui:message key="bookingsview.datos" /></h3>
			</div>
			<ul class="list-group list-group-flush">
				<li class="list-group-item">
					<p class="text-center">
						<strong><liferay-ui:message key="bookingsview.nombreApellidos" /></strong> <em> <span
							id="nombreApellidos">${nombre} ${apellidos}</span>
						</em>
					</p>
				</li>
				<li class="list-group-item">
					<p class="text-center">
						<strong><liferay-ui:message key="bookingsview.email" /></strong> <em> <span id="email">${email}</span>
						</em>
					</p>
				</li>
				<li class="list-group-item">
					<p class="text-center">
						<strong><liferay-ui:message key="bookingsview.fechaEntrada" /></strong> <em> <span
							id="fechaEntrada">${fechaEntrada}</span>
						</em>
					</p>
				</li>
				<li class="list-group-item">
					<p class="text-center">
						<strong><liferay-ui:message key="bookingsview.fechaSalida" /></strong> <em> <span id="fechaSalida">${fechaSalida}</span>
						</em>
					</p>
				</li>
				<li class="list-group-item">
					<p class="text-center">
						<strong><liferay-ui:message key="bookingsview.habitaciones" /></strong> <em> <span
							id="habitaciones">${habitaciones}</span>
						</em>
					</p>
				</li>
				<li class="list-group-item">
					<p class="text-center">
						<strong><liferay-ui:message key="bookingsview.personas" /></strong> <em> <span id="personas">${personas}</span>
						</em>
					</p>
				</li>
				<li class="list-group-item">
					<p class="text-center">
						<strong><liferay-ui:message key="bookingsview.alojamiento" /></strong> <em> <span id="alojamiento">${hosting.getName()}</span>
						</em>
					</p>
				</li>
			</ul>
		</div>
	</div>
	<div class="card text-center">
		<div class="card-body">
			<div class="card-title">
				<h4><liferay-ui:message key="bookingsview.precio" /></h4>
			</div>
			<div class="card-text">${totalPrice} $</div>
			
		</div>
	</div>

	<aui:button-row>
		<portlet:actionURL var="createURL"
			name="<%=MVCCommandNames.ADD_BOOKING%>">
			<portlet:param name="nombre" value="${nombre}" />
			<portlet:param name="apellidos" value="${apellidos}" />
			<portlet:param name="email" value="${email}" />
			<portlet:param name="fechaEntrada" value="${fechaEntrada}" />
			<portlet:param name="fechaSalida" value="${fechaSalida}" />
			<portlet:param name="habitaciones" value="${habitaciones}" />
			<portlet:param name="personas" value="${personas}" />
			<portlet:param name="idAlojamiento" value="${hosting.getId()}" />
		</portlet:actionURL>
		<aui:button cssClass="btn btn-primary" value="bookingsview.confirmar"
			href="${createURL}" />
		<portlet:renderURL var="cancelURL">
			<portlet:param name="mvcRenderCommandName"
				value="<%=MVCCommandNames.CANCEL_BOOKING%>" />
		</portlet:renderURL>
		<aui:button cssClass="btn btn-primary" value="bookingsview.cancelar"
			href="${cancelURL}" />
	</aui:button-row>
</div>