package com.kumbirai.spring.microservices.currencyexchangeservice.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kumbirai.spring.microservices.currencyexchangeservice.controller.bean.CurrencyExchange;

/**
 * <p><b>Purpose:</b><br>
 * <br>
 *
 * <p><b>Title:</b> CurrencyExchangeRepository<br>
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
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>
{
	CurrencyExchange findByFromAndTo(String from, String to);
}
