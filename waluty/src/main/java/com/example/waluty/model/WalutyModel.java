package com.example.waluty.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class WalutyModel {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String currency;
    private int days;
    private float mid;

    public WalutyModel(String currency, int days, float mid) {
        this.currency = currency;
        this.days = days;
        this.mid = mid;
    }

    public WalutyModel() {

    }

    public String getCurrency() {
        return currency;
    }

    public long getId() {
        return id;
    }

    public int getDays() {
        return days;
    }

    public float getMid() {
        return mid;
    }
}
