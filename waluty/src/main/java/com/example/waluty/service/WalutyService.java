package com.example.waluty.service;

import com.example.waluty.model.WalutyModel;
import com.example.waluty.walutyclient.waluty.WalutyClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class WalutyService {

    private final WalutyClient walutyClient;

    public WalutyModel getWaluty(String currency, int days) {
        String response = walutyClient.getWalutyFor(currency, days);
        log.info(response);
        return null;
    }
}
