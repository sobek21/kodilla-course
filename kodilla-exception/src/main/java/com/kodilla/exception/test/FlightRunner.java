package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightRunner {

    public void findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Jasionka", false);
        flightMap.put("Balice", true);
        flightMap.put("Krakow", true);

        if (!flightMap.containsKey(flight.arrivalAirport) &&
                !flightMap.containsKey(flight.departureAirport)) {
            throw new RouteNotFoundException("Arrival airport doesn't exist");
        }
        if (flightMap.getOrDefault(flight.arrivalAirport, true)
                || flightMap.getOrDefault(flight.departureAirport,true))
            System.out.println("Airport exist and you can fly there");
        else {
            System.out.println("Airport exist, but you can't fly there ");
        }
    }
    public static void main(String[] args) {

        FlightRunner flightRunner = new FlightRunner();
        Flight flight = new Flight("Jasionka", "Balice");

        try {
            flightRunner.findFilght(flight);
        }catch (RouteNotFoundException e) {
            System.out.println(e);
        }finally {
            System.out.println("Result^^");
        }
    }
}


