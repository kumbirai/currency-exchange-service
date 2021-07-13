package com.kumbirai.spring.microservices.currencyexchangeservice.repository;

import com.kumbirai.spring.microservices.currencyexchangeservice.bean.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p><b>Purpose:</b><br>
 * <br>
 *
 * <p><b>Title:</b> CurrencyExchangeRepository<br>
 * <br>
 *
 * @author Kumbirai 'Coach' Mundangepfupfu<br>
 * @version 1.0<br>
 *
 * <b>Revision:</b>
 * <br>
 */
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>
{
    CurrencyExchange findByFromAndTo(String from, String to);
}
