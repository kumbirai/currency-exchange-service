package com.kumbirai.spring.microservices.currencyexchangeservice;

import com.kumbirai.rest.webservices.exception.CustomizedResponseEntityExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({CustomizedResponseEntityExceptionHandler.class})
public class CurrencyExchangeServiceApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
    }
}