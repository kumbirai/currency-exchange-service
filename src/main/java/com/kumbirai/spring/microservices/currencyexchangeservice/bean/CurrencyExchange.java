/*
 Copyright (c) 2021

 All rights reserved.
 */
package com.kumbirai.spring.microservices.currencyexchangeservice.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * <p><b>Purpose:</b><br>
 * <br>
 *
 * <p><b>Title:</b> CurrencyExchange<br>
 * <br>
 *
 * @author Kumbirai 'Coach' Mundangepfupfu<br>
 * @version 1.0<br>
 *
 * <b>Revision:</b>
 * <br>
 */
@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class CurrencyExchange
{
    @Id
    @NonNull
    private Long id;

    @Column(name = "currency_from", length = 10)
    @NonNull
    private String from;

    @Column(name = "currency_to", length = 10)
    @NonNull
    private String to;

    @NonNull
    @Column(scale = 10, precision = 6)
    private BigDecimal conversionMultiple;

    @Column(length = 10)
    private String environment;
}
