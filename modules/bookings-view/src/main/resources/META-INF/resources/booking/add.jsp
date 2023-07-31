<%@ page import="java.util.List"%>
<%@ page import="java.util.Date"%>
<%@ page import="com.liferay.web.portlet.util.Hosting"%>
<%@ page import="com.liferay.web.constants.MVCCommandNames"%>
<%@ include file="../init.jsp"%>

<portlet:renderURL var="confirmationURL">
	<portlet:param name="mvcRenderCommandName"
		value="<%=MVCCommandNames.CONFIRM_BOOKING%>" />
</portlet:renderURL>

<div class="container-fluid-1200">
	<liferay-ui:header title="bookingsview.add" backURL="<%=backURL%>"></liferay-ui:header>
	<aui:form action="${confirmationURL}">
		<div>
			<aui:fieldset>
				<aui:input class="form-control" label="bookingsview.nombre"
					id="nombre" name="nombre" type="text" required="true">
					<aui:validator name="required"
						errorMessage="bookingsview.error.obligatorio.nombre" />
				</aui:input>
			</aui:fieldset>
			<aui:fieldset>
				<aui:input class="form-control" label="bookingsview.apellidos"
					id="apellidos" name="apellidos" type="text" required="true">
					<aui:validator name="required"
						errorMessage="bookingsview.error.obligatorio.apellidos" />
				</aui:input>
			</aui:fieldset>
			<aui:fieldset>
				<aui:input class="form-control" label="bookingsview.email"
					id="email" name="email" type="email" required="true">
					<aui:validator name="required"
						errorMessage="bookingsview.error.obligatorio.email" />
				</aui:input>
			</aui:fieldset>
			<aui:fieldset>
				<aui:input class="form-control fecha"
					label="bookingsview.fechaEntrada" id="fechaEntrada"
					name="fechaEntrada" type="date" required="true">
					<aui:validator name="required"
						errorMessage="bookingsview.error.obligatorio.fechaEntrada" />
					<aui:validator name="custom"
						errorMessage="bookingsview.error.valores.fechaEntrada">
			            function (val, fieldNode, ruleValue) {
			                var fechaEntrada = Date.parse(val);
						    var hoy = new Date();						
						    
						    var diferenciaEnMilisegundos = fechaEntrada - hoy.getTime();
						    var diferenciaEnDias = diferenciaEnMilisegundos / (1000 * 3600 * 24);
												    
						    return diferenciaEnDias >= 3;
			            }
			        </aui:validator>
				</aui:input>
			</aui:fieldset>
			<aui:fieldset>
				<aui:input class="form-control fecha"
					label="bookingsview.fechaSalida" id="fechaSalida"
					name="fechaSalida" type="date" required="true">
					<aui:validator name="required"
						errorMessage="bookingsview.error.obligatorio.fechaSalida" />
					<aui:validator name="custom"
						errorMessage="bookingsview.error.valores.fechaSalida">
			            function (val, fieldNode, ruleValue) {			            		
						    var fechaSalida = Date.parse(val);
						    var campoFechaEntrada = A.one('#<portlet:namespace />fechaEntrada');
						    if (campoFechaEntrada === null) {
						    	return false;
						    }
						    var fechaEntrada = Date.parse(campoFechaEntrada.val());
						
						    return fechaSalida > fechaEntrada;
						}
	        		</aui:validator>
				</aui:input>
			</aui:fieldset>
			<aui:fieldset>
				<aui:select id="idAlojamiento" label="bookingsview.alojamiento"
					name="idAlojamiento" showEmptyOption="true" required="true">
					<c:forEach
						items="<%=(List<Hosting>) request.getAttribute("hostings")%>"
						var="hosting">
						<aui:option value="${hosting.getId()}">${hosting.getName()}</aui:option>
					</c:forEach>
					<aui:validator name="required"
						errorMessage="bookingsview.error.obligatorio.alojamiento" />
				</aui:select>
			</aui:fieldset>
			<aui:fieldset>
				<aui:input class="form-control" label="bookingsview.habitaciones"
					id="habitaciones" name="habitaciones" min="1" step="1"
					type="number" required="true">
					<aui:validator name="required"
						errorMessage="bookingsview.error.obligatorio.habitaciones" />
				</aui:input>
			</aui:fieldset>
			<aui:fieldset>
				<aui:input class="form-control" label="bookingsview.personas"
					id="personas" name="personas" min="1" step="1" type="number"
					required="true">
					<aui:validator name="required"
						errorMessage="bookingsview.error.obligatorio.personas" />
				</aui:input>
			</aui:fieldset>
		</div>
		<aui:button-row>
			<aui:button id="popupButton" value="bookingsview.accept"
				type="submit" />
		</aui:button-row>
	</aui:form>
</div>