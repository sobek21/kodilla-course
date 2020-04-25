package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private BigDecimal peopleQuanity;
    private String countryName;

    public Country(String countryName, BigDecimal peopleQuanity) {
        this.peopleQuanity = peopleQuanity;
        this.countryName = countryName;}

    public BigDecimal getPeopleQuanity() {
        return peopleQuanity;}

    @Override
    public String toString() {
        return "countryName='" + countryName + '\'';}
}

