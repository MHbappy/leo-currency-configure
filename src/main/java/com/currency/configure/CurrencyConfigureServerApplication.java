package com.currency.configure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CurrencyConfigureServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CurrencyConfigureServerApplication.class, args);
    }
}
