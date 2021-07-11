/*
 Copyright (c) 2021

 All rights reserved.
 */
package com.kumbirai.spring.microservices.currencyexchangeservice.exception;

/**
 * <p><b>Purpose:</b><br>
 * <br>
 *
 * <p><b>Title:</b> CurrencyExchangeException<br>
 * <br>
 *
 * @author Kumbirai 'Coach' Mundangepfupfu<br>
 * @date 29 May 2021<br>
 * @version 1.0<br>
 *
 * <b>Revision:</b>
 * <br>
 *					
 */
public class CurrencyExchangeException extends RuntimeException
{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6510873148780734408L;

	/**
	 * Constructor: @param message
	 */
	public CurrencyExchangeException(String message)
	{
		super(message);
	}
}
