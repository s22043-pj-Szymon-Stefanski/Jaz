package com.example.waluty.controller;

import com.example.waluty.model.WalutyModel;
import com.example.waluty.service.WalutyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalutyController {
    private final WalutyService walutyService;

    public WalutyController(WalutyService walutyService) {
        this.walutyService = walutyService;
    }

    @GetMapping("/waluty/{currency}")
    public WalutyModel getWaluty(@PathVariable String currency, @RequestParam(defaultValue = "1") int days) {
        return walutyService.getWaluty(currency, days);
    }
}
