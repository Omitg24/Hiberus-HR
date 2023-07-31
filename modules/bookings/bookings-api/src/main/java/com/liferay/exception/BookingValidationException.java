package com.liferay.exception;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

public class BookingValidationException extends PortalException {
	
	private static final long serialVersionUID = 1L;
	
	private List<String> errors;

	public BookingValidationException() { }
	
	public BookingValidationException(String msg) {
		super(msg);
	}
	
	public BookingValidationException(String msg, Throwable t) {
		super(msg, t);
	}
	
	public BookingValidationException(Throwable t) {
		super(t);
	}
	
	public BookingValidationException(List<String> errors) {
		super(String.join(", ", errors));
		this.errors = errors;
	}
	
	public List<String> getErrors() {
		return errors;
	}
}
