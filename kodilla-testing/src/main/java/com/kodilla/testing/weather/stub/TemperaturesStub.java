package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures {
    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<Integer, Double>();

        // dummy data
        stubResult.put(0, 25.5);
        stubResult.put(1, 26.2);


        return stubResult;
    }
}