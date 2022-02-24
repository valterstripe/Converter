package com.example.model;

import java.util.HashMap;
import java.util.Map;

/**
 * todo Document type Rates
 */
public class Rate {
    private String name;
    private Double value;

    public Rate(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
