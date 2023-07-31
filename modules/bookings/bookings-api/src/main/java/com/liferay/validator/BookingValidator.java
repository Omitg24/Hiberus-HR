package com.liferay.validator;

import com.liferay.exception.BookingValidationException;

import java.util.Date;
import java.util.List;

public interface BookingValidator {
	public void validate(String nombre, String apellidos, String email, Date fechaEntrada, Date fechaSalida,
			long idAlojamiento, int habitaciones, int personas) throws BookingValidationException;
	public List<String> getErrors();
}
