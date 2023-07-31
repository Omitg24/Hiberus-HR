/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.model.Reserva;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.service.base.ReservaLocalServiceBaseImpl;
import com.liferay.validator.BookingValidator;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
		property = "model.class.name=com.liferay.model.Reserva", 
		service = AopService.class
)
public class ReservaLocalServiceImpl extends ReservaLocalServiceBaseImpl {
	
	@Reference
	BookingValidator bookingValidator;

	public Reserva addReserva(long groupId, String nombre, String apellidos, String email, long idAlojamiento,
			Date fechaEntrada, Date fechaSalida, int habitaciones, int personas, ServiceContext serviceContext)
			throws PortalException {
		bookingValidator.validate(nombre, apellidos, email, fechaEntrada, fechaSalida, idAlojamiento, habitaciones, personas);
		
		long userId = serviceContext.getUserId();
		User user = UserLocalServiceUtil.getUser(userId);

		long idReserva = CounterLocalServiceUtil.increment(ReservaLocalServiceImpl.class.getName());
		Reserva reserva = createReserva(idReserva);

		reserva.setNombre(nombre);
		reserva.setApellidos(apellidos);
		reserva.setEmail(email);
		reserva.setIdAlojamiento(idAlojamiento);
		reserva.setFechaEntrada(fechaEntrada);
		reserva.setFechaSalida(fechaSalida);
		reserva.setHabitaciones(habitaciones);
		reserva.setPersonas(personas);

		reserva.setGroupId(groupId);
		reserva.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		reserva.setUserId(userId);
		reserva.setUserName(user.getScreenName());

		return super.addReserva(reserva);
	}

	public Reserva updateReserva(long idReserva, String nombre, String apellidos, String email, long idAlojamiento,
			Date fechaEntrada, Date fechaSalida, int habitaciones, int personas, ServiceContext serviceContext)
			throws PortalException {

		bookingValidator.validate(nombre, apellidos, email, fechaEntrada, fechaSalida, idAlojamiento, habitaciones, personas);
		
		Reserva reserva = super.getReserva(idReserva);
		reserva.setNombre(nombre);
		reserva.setApellidos(apellidos);
		reserva.setEmail(email);
		reserva.setIdAlojamiento(idAlojamiento);
		reserva.setFechaEntrada(fechaEntrada);
		reserva.setFechaSalida(fechaSalida);
		reserva.setHabitaciones(habitaciones);
		reserva.setPersonas(personas);
		
		reserva.setModifiedDate(serviceContext.getModifiedDate(new Date()));

		return super.updateReserva(reserva);
	}
	
	public List<Reserva> getReservas() {		
		return reservaPersistence.findAll();
	}
	
	public List<Reserva> getReservasByGroupId(long groupId) {
		return reservaPersistence.findBygroupId(groupId);
	}

	public List<Reserva> getReservasByGroupId(long groupId, int start, int end) {

		return reservaPersistence.findBygroupId(groupId, start, end);
	}

	public List<Reserva> getReservasByGroupId(long groupId, int start, int end,
			OrderByComparator<Reserva> orderByComparator) {

		return reservaPersistence.findBygroupId(groupId, start, end, orderByComparator);
	}

	public List<Reserva> getReservasByKeywords(long groupId, String keywords, int start, int end,
			OrderByComparator<Reserva> orderByComparator) {

		return reservaLocalService.dynamicQuery(getKeywordSearchDynamicQuery(groupId, keywords), start, end,
				orderByComparator);
	}

	public long getReservasCountByKeywords(long groupId, String keywords) {
		return reservaLocalService.dynamicQueryCount(getKeywordSearchDynamicQuery(groupId, keywords));
	}

	private DynamicQuery getKeywordSearchDynamicQuery(long groupId, String keywords) {

		DynamicQuery dynamicQuery = dynamicQuery().add(RestrictionsFactoryUtil.eq("groupId", groupId));

		if (Validator.isNotNull(keywords)) {
			Disjunction disjunctionQuery = RestrictionsFactoryUtil.disjunction();
			disjunctionQuery.add(RestrictionsFactoryUtil.like("personas", "%" + keywords + "%"));
			disjunctionQuery.add(RestrictionsFactoryUtil.like("habitaciones", "%" + keywords + "%"));
			dynamicQuery.add(disjunctionQuery);
		}

		return dynamicQuery;
	}

	@Override
	public Reserva addReserva(Reserva reserva) {
		throw new UnsupportedOperationException("Not supported.");
	}

	@Override
	public Reserva updateReserva(Reserva reserva) {
		throw new UnsupportedOperationException("Not supported.");
	}
}