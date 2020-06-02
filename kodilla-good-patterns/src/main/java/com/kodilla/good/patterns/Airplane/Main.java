package com.kodilla.good.patterns.Airplane;

public class Main {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();

        System.out.println("ZAD1");
        try {
            flightFinder.flightFromCity("Warszawa");
        }catch (Exception e){
            System.out.println("Airport doesn't exist");
        }
        System.out.println("ZAD2");
        try {
            flightFinder.flightToCity("Kraków");
        }catch (Exception e) {
            System.out.println("Airport doesn't exist");
        }
        System.out.println("ZAD3");
        try {
            flightFinder.flightThrough("Warszawa", "Kraków");
        } catch (Exception e) {
            System.out.println("Airport doesn't exist");
        }
    }
}
