<%@ page import="com.liferay.model.Reserva"%>
<%@ include file="../init.jsp"%>

<div class="container-fluid-1200">
	<liferay-ui:header title="bookingsview.view" backURL="<%=backURL%>"></liferay-ui:header>
	<div class="card">
		<div class="card-body">
			<div class="card">
				<div class="card-body">
					<div class="card-title"><liferay-ui:message key="bookingsview.alojamiento" /></div>
					<h4 class="card-text">${hosting.getName()}</h4>
					<p class="card-text"><small class="text-muted"><liferay-ui:message key="bookingsview.precio" /> <strong>${totalPrice} $</strong></small></p>
				</div>
			</div>
			<div class="card">
				<div class="card-body">
					<div class="card-title"><liferay-ui:message key="bookingsview.nombreApellidos" /></div>
					<p class="card-text">${booking.getNombre()}
						${booking.getApellidos()}</p>
				</div>
			</div>
			<div class="card">
				<div class="card-body">
					<div class="card-title"><liferay-ui:message key="bookingsview.email" /></div>
					<p class="card-text">${booking.getEmail()}</p>
				</div>
			</div>
			<div class="card">
				<div class="card-body">
					<div class="card-title"><liferay-ui:message key="bookingsview.fechas" /></div>
					<div class="table-responsive">
						<table class="table table-hover">
							<thead class="thead-dark">
								<tr>
									<th scope="col"><liferay-ui:message key="bookingsview.fechaEntrada" /></th>
									<th scope="col"><liferay-ui:message key="bookingsview.fechaSalida" /></th>
								</tr>
							</thead>
							<tbody class="tbody-light">
								<tr>
									<td scope="row">${booking.getFechaEntrada()}</td>
									<td scope="row">${booking.getFechaSalida()}</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<div class="card">
				<div class="card-body">
					<div class="card-title"><liferay-ui:message key="bookingsview.detalles" /></div>
					<div class="table-responsive">
						<table class="table table-hover">
							<thead class="thead-dark">
								<tr>
									<th scope="col"><liferay-ui:message key="bookingsview.habitaciones" /></th>
									<th scope="col"><liferay-ui:message key="bookingsview.personas" /></th>
								</tr>
							</thead>
							<tbody class="tbody-light">
								<tr>
									<td scope="row">${booking.getHabitaciones()}</td>
									<td scope="row">${booking.getPersonas()}</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>