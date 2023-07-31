create index IX_784B6131 on BOOKINGS_Reserva (groupId);
create index IX_5F58BD4D on BOOKINGS_Reserva (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D69A330F on BOOKINGS_Reserva (uuid_[$COLUMN_LENGTH:75$], groupId);