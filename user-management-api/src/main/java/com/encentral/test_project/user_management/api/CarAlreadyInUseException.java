package com.encentral.test_project.user_management.api;

public class CarAlreadyInUseException extends Exception 
{

	public CarAlreadyInUseException() 
	{
		super();
		
	}

	public CarAlreadyInUseException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) 
	{
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public CarAlreadyInUseException(String message, Throwable cause) 
	{
		super(message, cause);
		
	}

	public CarAlreadyInUseException(String message) 
	{
		super(message);
		
	}

	public CarAlreadyInUseException(Throwable cause) 
	{
		super(cause);
		
	}

}
