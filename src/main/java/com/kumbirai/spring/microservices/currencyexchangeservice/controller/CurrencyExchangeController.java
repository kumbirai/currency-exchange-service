/*
 Copyright (c) 2021

 All rights reserved.
 */
package com.kumbirai.spring.microservices.currencyexchangeservice.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kumbirai.spring.microservices.currencyexchangeservice.controller.bean.CurrencyExchange;
import com.kumbirai.spring.microservices.currencyexchangeservice.controller.repository.CurrencyExchangeRepository;
import com.kumbirai.spring.microservices.currencyexchangeservice.exception.CurrencyExchangeException;

/**
 * <p><b>Purpose:</b><br>
 * <br>
 *
 * <p><b>Title:</b> CurrencyExchangeController<br>
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
@RestController
public class CurrencyExchangeController
{
	private static final Logger LOGGER = LogManager.getLogger(CurrencyExchangeController.class.getName());

	@Autowired
	private CurrencyExchangeRepository repository;

	@Autowired
	private Environment environment;

	/**
	 * Constructor:
	 */
	public CurrencyExchangeController()
	{
		super();
		LOGGER.trace("CurrencyExchangeController.CONSTRUCTOR");
	}

	/**
	 * Purpose:<br>
	 * <br>
	 * retrieveExchangeValue<br>
	 * <br>
	 * @param from
	 * @param to
	 * @return<br>
	 * <br>
	 */
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(@PathVariable String from, @PathVariable String to)
	{
		LOGGER.info("retrieveExchangeValue called with {} to {}", from, to);

		var currencyExchange = repository.findByFromAndTo(from, to);

		if (currencyExchange == null)
		{
			throw new CurrencyExchangeException(String.format("Unable to Find data for '%s' to '%s'", from, to));
		}

		String port = environment.getProperty("local.server.port");
		currencyExchange.setEnvironment(port);

		return currencyExchange;
	}
}
