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

package com.liferay.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Reserva}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Reserva
 * @generated
 */
public class ReservaWrapper
	extends BaseModelWrapper<Reserva>
	implements ModelWrapper<Reserva>, Reserva {

	public ReservaWrapper(Reserva reserva) {
		super(reserva);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idReserva", getIdReserva());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nombre", getNombre());
		attributes.put("apellidos", getApellidos());
		attributes.put("email", getEmail());
		attributes.put("idAlojamiento", getIdAlojamiento());
		attributes.put("fechaEntrada", getFechaEntrada());
		attributes.put("fechaSalida", getFechaSalida());
		attributes.put("habitaciones", getHabitaciones());
		attributes.put("personas", getPersonas());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long idReserva = (Long)attributes.get("idReserva");

		if (idReserva != null) {
			setIdReserva(idReserva);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String apellidos = (String)attributes.get("apellidos");

		if (apellidos != null) {
			setApellidos(apellidos);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Long idAlojamiento = (Long)attributes.get("idAlojamiento");

		if (idAlojamiento != null) {
			setIdAlojamiento(idAlojamiento);
		}

		Date fechaEntrada = (Date)attributes.get("fechaEntrada");

		if (fechaEntrada != null) {
			setFechaEntrada(fechaEntrada);
		}

		Date fechaSalida = (Date)attributes.get("fechaSalida");

		if (fechaSalida != null) {
			setFechaSalida(fechaSalida);
		}

		Integer habitaciones = (Integer)attributes.get("habitaciones");

		if (habitaciones != null) {
			setHabitaciones(habitaciones);
		}

		Integer personas = (Integer)attributes.get("personas");

		if (personas != null) {
			setPersonas(personas);
		}
	}

	@Override
	public Reserva cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the apellidos of this reserva.
	 *
	 * @return the apellidos of this reserva
	 */
	@Override
	public String getApellidos() {
		return model.getApellidos();
	}

	/**
	 * Returns the company ID of this reserva.
	 *
	 * @return the company ID of this reserva
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this reserva.
	 *
	 * @return the create date of this reserva
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this reserva.
	 *
	 * @return the email of this reserva
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the fecha entrada of this reserva.
	 *
	 * @return the fecha entrada of this reserva
	 */
	@Override
	public Date getFechaEntrada() {
		return model.getFechaEntrada();
	}

	/**
	 * Returns the fecha salida of this reserva.
	 *
	 * @return the fecha salida of this reserva
	 */
	@Override
	public Date getFechaSalida() {
		return model.getFechaSalida();
	}

	/**
	 * Returns the group ID of this reserva.
	 *
	 * @return the group ID of this reserva
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the habitaciones of this reserva.
	 *
	 * @return the habitaciones of this reserva
	 */
	@Override
	public int getHabitaciones() {
		return model.getHabitaciones();
	}

	/**
	 * Returns the id alojamiento of this reserva.
	 *
	 * @return the id alojamiento of this reserva
	 */
	@Override
	public long getIdAlojamiento() {
		return model.getIdAlojamiento();
	}

	/**
	 * Returns the id reserva of this reserva.
	 *
	 * @return the id reserva of this reserva
	 */
	@Override
	public long getIdReserva() {
		return model.getIdReserva();
	}

	/**
	 * Returns the modified date of this reserva.
	 *
	 * @return the modified date of this reserva
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nombre of this reserva.
	 *
	 * @return the nombre of this reserva
	 */
	@Override
	public String getNombre() {
		return model.getNombre();
	}

	/**
	 * Returns the personas of this reserva.
	 *
	 * @return the personas of this reserva
	 */
	@Override
	public int getPersonas() {
		return model.getPersonas();
	}

	/**
	 * Returns the primary key of this reserva.
	 *
	 * @return the primary key of this reserva
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this reserva.
	 *
	 * @return the user ID of this reserva
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this reserva.
	 *
	 * @return the user name of this reserva
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this reserva.
	 *
	 * @return the user uuid of this reserva
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this reserva.
	 *
	 * @return the uuid of this reserva
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the apellidos of this reserva.
	 *
	 * @param apellidos the apellidos of this reserva
	 */
	@Override
	public void setApellidos(String apellidos) {
		model.setApellidos(apellidos);
	}

	/**
	 * Sets the company ID of this reserva.
	 *
	 * @param companyId the company ID of this reserva
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this reserva.
	 *
	 * @param createDate the create date of this reserva
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this reserva.
	 *
	 * @param email the email of this reserva
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the fecha entrada of this reserva.
	 *
	 * @param fechaEntrada the fecha entrada of this reserva
	 */
	@Override
	public void setFechaEntrada(Date fechaEntrada) {
		model.setFechaEntrada(fechaEntrada);
	}

	/**
	 * Sets the fecha salida of this reserva.
	 *
	 * @param fechaSalida the fecha salida of this reserva
	 */
	@Override
	public void setFechaSalida(Date fechaSalida) {
		model.setFechaSalida(fechaSalida);
	}

	/**
	 * Sets the group ID of this reserva.
	 *
	 * @param groupId the group ID of this reserva
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the habitaciones of this reserva.
	 *
	 * @param habitaciones the habitaciones of this reserva
	 */
	@Override
	public void setHabitaciones(int habitaciones) {
		model.setHabitaciones(habitaciones);
	}

	/**
	 * Sets the id alojamiento of this reserva.
	 *
	 * @param idAlojamiento the id alojamiento of this reserva
	 */
	@Override
	public void setIdAlojamiento(long idAlojamiento) {
		model.setIdAlojamiento(idAlojamiento);
	}

	/**
	 * Sets the id reserva of this reserva.
	 *
	 * @param idReserva the id reserva of this reserva
	 */
	@Override
	public void setIdReserva(long idReserva) {
		model.setIdReserva(idReserva);
	}

	/**
	 * Sets the modified date of this reserva.
	 *
	 * @param modifiedDate the modified date of this reserva
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nombre of this reserva.
	 *
	 * @param nombre the nombre of this reserva
	 */
	@Override
	public void setNombre(String nombre) {
		model.setNombre(nombre);
	}

	/**
	 * Sets the personas of this reserva.
	 *
	 * @param personas the personas of this reserva
	 */
	@Override
	public void setPersonas(int personas) {
		model.setPersonas(personas);
	}

	/**
	 * Sets the primary key of this reserva.
	 *
	 * @param primaryKey the primary key of this reserva
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this reserva.
	 *
	 * @param userId the user ID of this reserva
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this reserva.
	 *
	 * @param userName the user name of this reserva
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this reserva.
	 *
	 * @param userUuid the user uuid of this reserva
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this reserva.
	 *
	 * @param uuid the uuid of this reserva
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected ReservaWrapper wrap(Reserva reserva) {
		return new ReservaWrapper(reserva);
	}

}