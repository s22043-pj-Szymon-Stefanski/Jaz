package com.example.waluty.walutyclient.waluty;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WalutyClient {

    private RestTemplate restTemplate = new RestTemplate();

    public String getWalutyFor(String currency, int days) {
        return restTemplate.getForObject("https://api.nbp.pl/api/exchangerates/rates/a/{currency}/last/{days}/?format=json",
                String.class, currency, days);
    }
}
