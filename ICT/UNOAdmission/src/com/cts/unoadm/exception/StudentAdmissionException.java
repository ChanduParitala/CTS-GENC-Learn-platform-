package com.cts.unoadm.exception;

public class StudentAdmissionException extends Exception {

	private static final long serialVersionUID = -1105431869622052445L;

	/**
	 * @param message
	 * @param cause
	 */
	public StudentAdmissionException(String message, Throwable cause) {
		super(message, cause);
	}
}
