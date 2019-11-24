package com.abeldevelop.architecture.library.exception.server;

import java.util.List;

import com.abeldevelop.architecture.library.exception.server.InternalServerErrorException;


public class ValidationResponseException extends InternalServerErrorException {

	private static final long serialVersionUID = -321979208013613486L;

	public ValidationResponseException(String message) {
		super(message);
	}

	public ValidationResponseException(String message, List<Object> arguments) {
		super(message, arguments);
	}
	
	public ValidationResponseException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ValidationResponseException(String message, List<Object> arguments, Throwable cause) {
		super(message, arguments, cause);
	}
	
}