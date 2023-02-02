package com.currency.configure.controller;

import com.currency.configure.domain.CurrencyExchangeRate;
import com.currency.configure.repository.CurrencyExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigureController {

    @Autowired
    CurrencyExchangeRateRepository currencyExchangeRateRepository;

    @PostMapping("/api/v1/quote/save-currency")
    public CurrencyExchangeRate saveCurrency(@RequestBody CurrencyExchangeRate currencyExchangeRate){
        return currencyExchangeRateRepository.save(currencyExchangeRate);
    }

}
