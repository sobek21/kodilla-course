package com.kodilla.good.patterns.Airplane;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightFinder {

    FlightDatabase flightDatabase = new FlightDatabase();

    public void flightFromCity(String city) throws NoSuchElementException {

        String lot = flightDatabase.access().stream().filter(a -> a.flightFrom.equals(city))
                .map(a -> a.flightTo).
                        reduce((a, a1) -> a + "," + a1).get();

        System.out.println("From " + "'" + city + "'" + " You can fly to: " + lot);
    }

    public void flightToCity(String city) throws NoSuchElementException {

        String lot1 = flightDatabase.access().stream().filter(a -> a.flightTo.equals(city))
                .map(a -> a.flightFrom).
                        reduce((a, a1) -> a + "," + a1).get();

        System.out.println("You can Fly to " + "'" + city + "'" + " from: " + lot1);
    }
    public void flightThrough(String cityFrom, String cityTo) throws NoSuchElementException {

        Set<String> interchangeCity = new HashSet<>();

        List<String> CitiesFromTo = flightDatabase.access().stream().
                filter(a -> a.flightFrom.equals(cityFrom)).
                map(a -> a.flightTo).
                collect(Collectors.toList());

        if (flightDatabase.access().stream().
                filter(a -> a.flightFrom.equals(cityFrom)).
                anyMatch(a -> a.flightTo.equals(cityTo))) {
            System.out.println("you can fly directly from " + "'" + cityFrom + "'" + " to " + "'" + cityTo + "'");
        }
        for (String sm : CitiesFromTo) {
            if (flightDatabase.access().stream().
                    filter(a -> a.flightFrom.equals(sm)).
                    anyMatch(a -> a.flightTo.equals(cityTo))) {
                interchangeCity.add(sm);
            }
        }
      String lot = interchangeCity.stream().collect(Collectors.joining(","));

        if (!(interchangeCity.isEmpty()))
            System.out.println("flight possible with a change,possible transfers in: "+lot);
        else {
            System.out.println("Sorry, there is no such flight");
        }
    }
}











