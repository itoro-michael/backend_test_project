package com.encentral.test_project.user_management.api;

public class CarNotInUseException extends Exception 
{

	public CarNotInUseException() 
	{
		super();
		
	}

	public CarNotInUseException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) 
	{
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public CarNotInUseException(String message, Throwable cause) 
	{
		super(message, cause);
		
	}

	public CarNotInUseException(String message) 
	{
		super(message);
		
	}

	public CarNotInUseException(Throwable cause) 
	{
		super(cause);
		
	}

}
