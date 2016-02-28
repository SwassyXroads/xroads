package com.xroads.exception;

public class XroadsDataValidationException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2320382127820623644L;

	public XroadsDataValidationException(Throwable e)
	{
		super(e.getMessage(),e);
	}
	
	public XroadsDataValidationException(String msg, Throwable e)
	{
		super(msg ,e);
	}
	
	public XroadsDataValidationException(String msg)
	{
		super(msg);
	}
	
}