package com.liferay.util.validator;

import com.liferay.exception.BookingValidationException;
import com.liferay.validator.BookingValidator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true, 
		service = BookingValidator.class
	)
public class BookingValidatorImpl implements BookingValidator {

	private List<String> errors;
	
	@Override
	public List<String> getErrors() {
		return errors;
	}

	@Override
	public void validate(String nombre, String apellidos, String email, Date fechaEntrada, Date fechaSalida,
			long idAlojamiento, int habitaciones, int personas) throws BookingValidationException {
		errors = new ArrayList<>();
		boolean isBookingValid = isNameValid(nombre) && isSurnameValid(apellidos) && 
													isEmailValid(email) && isStartDateValid(fechaEntrada) && 
													isEndDateValid(fechaEntrada, fechaSalida) && isHostingIdValid(idAlojamiento) && 
													isNRoomsValid(habitaciones) && isNPersonsValid(personas);
		if (!isBookingValid) {
			throw new BookingValidationException(errors);
		}
	}

	private boolean isNameValid(String nombre) {
		boolean condition = nombre.trim().isEmpty();
		if (condition) {
			errors.add("El nombre no puede estar vacío, VALOR= " + nombre);
		}
		return !condition;
	}

	private boolean isSurnameValid(String apellidos) {
		boolean condition = apellidos.trim().isEmpty();
		if (condition) {
			errors.add("Los apellidos no pueden estar vacíos, VALOR= " + apellidos);
		}
		return !condition;
	}

	private boolean isEmailValid(String email) {
		boolean condition = email.trim().isEmpty();
		if (condition) {
			errors.add("El email no puede estar vacío, VALOR= " + email);
		}
		return !condition;
	}

	private boolean isStartDateValid(Date fechaEntrada) {		
		Date hoy = new Date();
		boolean condition = !fechaEntrada.toString().isEmpty() && fechaEntrada.getTime() - hoy.getTime() > 3;
		if (!condition) {
			errors.add("La fecha de entrada debe tener al menos 3 días de antelación, VALOR= " + fechaEntrada.toString());
		}
		return condition;
	}

	private boolean isEndDateValid(Date fechaEntrada, Date fechaSalida) {
		boolean condition = !fechaEntrada.toString().isEmpty() && !fechaSalida.toString().isEmpty() && fechaSalida.getTime() > fechaEntrada.getTime();
		if (!condition) {
			errors.add("La fecha de salida debe ser posterior a la fecha de entrada, VALOR= " + fechaSalida.toString());
		}
		return condition;
	}

	private boolean isHostingIdValid(long idAlojamiento) {
		boolean condition = idAlojamiento > 0;
		if (!condition) {
			errors.add("El id del alojamiento no es correcto, VALOR= " + idAlojamiento);			
		}
		return condition;
	}

	private boolean isNRoomsValid(int habitaciones) {
		boolean condition = habitaciones > 0;
		if (!condition) {
			errors.add("El numero de habitaciones debe ser superior o igual a 1, VALOR= " + habitaciones);			
		}
		return condition;
	}

	private boolean isNPersonsValid(int personas) {
		boolean condition = personas > 0;
		if (!condition) {
			errors.add("El numero de personas debe ser superior o igual a 1, VALOR= " + personas);			
		}
		return condition;
	}
}
