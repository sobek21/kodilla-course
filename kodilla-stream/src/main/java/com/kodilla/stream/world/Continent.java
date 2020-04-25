package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Continent {

    private String continentName;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;}

    public void addCountry(Country country){
        countryList.add(country);}

    public List<Country> getCountryList() {
        return countryList;}

    @Override
    public String toString() {
        return "continentName='" + continentName + '\'';}

}






