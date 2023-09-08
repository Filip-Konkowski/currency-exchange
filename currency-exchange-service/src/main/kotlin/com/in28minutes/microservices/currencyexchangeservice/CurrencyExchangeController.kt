package com.in28minutes.microservices.currencyexchangeservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CurrencyExchangeController {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    fun getExchangeValue(
        @PathVariable("from") from: String,
        @PathVariable("to") to: String
    ) {

    }
}