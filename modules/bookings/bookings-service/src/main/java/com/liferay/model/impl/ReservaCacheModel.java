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

package com.liferay.model.impl;

import com.liferay.model.Reserva;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Reserva in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ReservaCacheModel implements CacheModel<Reserva>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ReservaCacheModel)) {
			return false;
		}

		ReservaCacheModel reservaCacheModel = (ReservaCacheModel)object;

		if (idReserva == reservaCacheModel.idReserva) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idReserva);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idReserva=");
		sb.append(idReserva);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", apellidos=");
		sb.append(apellidos);
		sb.append(", email=");
		sb.append(email);
		sb.append(", idAlojamiento=");
		sb.append(idAlojamiento);
		sb.append(", fechaEntrada=");
		sb.append(fechaEntrada);
		sb.append(", fechaSalida=");
		sb.append(fechaSalida);
		sb.append(", habitaciones=");
		sb.append(habitaciones);
		sb.append(", personas=");
		sb.append(personas);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Reserva toEntityModel() {
		ReservaImpl reservaImpl = new ReservaImpl();

		if (uuid == null) {
			reservaImpl.setUuid("");
		}
		else {
			reservaImpl.setUuid(uuid);
		}

		reservaImpl.setIdReserva(idReserva);
		reservaImpl.setGroupId(groupId);
		reservaImpl.setCompanyId(companyId);
		reservaImpl.setUserId(userId);

		if (userName == null) {
			reservaImpl.setUserName("");
		}
		else {
			reservaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			reservaImpl.setCreateDate(null);
		}
		else {
			reservaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			reservaImpl.setModifiedDate(null);
		}
		else {
			reservaImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nombre == null) {
			reservaImpl.setNombre("");
		}
		else {
			reservaImpl.setNombre(nombre);
		}

		if (apellidos == null) {
			reservaImpl.setApellidos("");
		}
		else {
			reservaImpl.setApellidos(apellidos);
		}

		if (email == null) {
			reservaImpl.setEmail("");
		}
		else {
			reservaImpl.setEmail(email);
		}

		reservaImpl.setIdAlojamiento(idAlojamiento);

		if (fechaEntrada == Long.MIN_VALUE) {
			reservaImpl.setFechaEntrada(null);
		}
		else {
			reservaImpl.setFechaEntrada(new Date(fechaEntrada));
		}

		if (fechaSalida == Long.MIN_VALUE) {
			reservaImpl.setFechaSalida(null);
		}
		else {
			reservaImpl.setFechaSalida(new Date(fechaSalida));
		}

		reservaImpl.setHabitaciones(habitaciones);
		reservaImpl.setPersonas(personas);

		reservaImpl.resetOriginalValues();

		return reservaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idReserva = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nombre = objectInput.readUTF();
		apellidos = objectInput.readUTF();
		email = objectInput.readUTF();

		idAlojamiento = objectInput.readLong();
		fechaEntrada = objectInput.readLong();
		fechaSalida = objectInput.readLong();

		habitaciones = objectInput.readInt();

		personas = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(idReserva);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (nombre == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		if (apellidos == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(apellidos);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(idAlojamiento);
		objectOutput.writeLong(fechaEntrada);
		objectOutput.writeLong(fechaSalida);

		objectOutput.writeInt(habitaciones);

		objectOutput.writeInt(personas);
	}

	public String uuid;
	public long idReserva;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nombre;
	public String apellidos;
	public String email;
	public long idAlojamiento;
	public long fechaEntrada;
	public long fechaSalida;
	public int habitaciones;
	public int personas;

}