create table BOOKINGS_Reserva (
	uuid_ VARCHAR(75) null,
	idReserva LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nombre VARCHAR(75) null,
	apellidos VARCHAR(75) null,
	email VARCHAR(75) null,
	idAlojamiento LONG,
	fechaEntrada DATE null,
	fechaSalida DATE null,
	habitaciones INTEGER,
	personas INTEGER
);