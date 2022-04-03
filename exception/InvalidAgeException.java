package com.onebill.exception;


public class InvalidAgeException extends RuntimeException {
	
	public InvalidAgeException(String message)
	{
		super(message);
	}
}