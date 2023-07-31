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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;BOOKINGS_Reserva&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Reserva
 * @generated
 */
public class ReservaTable extends BaseTable<ReservaTable> {

	public static final ReservaTable INSTANCE = new ReservaTable();

	public final Column<ReservaTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ReservaTable, Long> idReserva = createColumn(
		"idReserva", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ReservaTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ReservaTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ReservaTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ReservaTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ReservaTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ReservaTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ReservaTable, String> nombre = createColumn(
		"nombre", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ReservaTable, String> apellidos = createColumn(
		"apellidos", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ReservaTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ReservaTable, Long> idAlojamiento = createColumn(
		"idAlojamiento", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ReservaTable, Date> fechaEntrada = createColumn(
		"fechaEntrada", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ReservaTable, Date> fechaSalida = createColumn(
		"fechaSalida", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<ReservaTable, Integer> habitaciones = createColumn(
		"habitaciones", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<ReservaTable, Integer> personas = createColumn(
		"personas", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

	private ReservaTable() {
		super("BOOKINGS_Reserva", ReservaTable::new);
	}

}