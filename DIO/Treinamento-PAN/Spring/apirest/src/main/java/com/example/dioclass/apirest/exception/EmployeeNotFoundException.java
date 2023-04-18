package com.example.dioclass.apirest.exception;

public class EmployeeNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(long idEmployee) {
		super("Could not find the id: " + idEmployee);
	}

}
