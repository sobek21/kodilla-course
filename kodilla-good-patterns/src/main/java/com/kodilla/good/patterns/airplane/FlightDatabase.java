package com.kodilla.good.patterns.airplane;

import java.util.HashSet;
import java.util.Set;

public class FlightDatabase {

    private static final String waw = "Warszawa";
    private static final String lub = "Lublin";
    private static final String kra = "Kraków";
    private static final String gd = "Gdańsk";
    private static final String wr = "Wrocław";
    private static final String lod = "Lódź";
    private static final String rze = "Rzeszów";
    private static final String m = "Mielec";
    private static final String d = "Dynów";

    private static final Set<Flight> flightSet = new HashSet<>();

    static {
        flightSet.add(new Flight(waw, lub));
        flightSet.add(new Flight(waw, kra));
        flightSet.add(new Flight(waw, gd));
        flightSet.add(new Flight(waw, wr));
        flightSet.add(new Flight(waw, lod));
        flightSet.add(new Flight(lod, waw));
        flightSet.add(new Flight(lod, rze));
        flightSet.add(new Flight(lod, wr));
        flightSet.add(new Flight(wr, kra));
        flightSet.add(new Flight(wr, gd));
        flightSet.add(new Flight(wr, waw));
        flightSet.add(new Flight(lub, waw));
        flightSet.add(new Flight(lub, rze));
        flightSet.add(new Flight(m, d));
    }
    static Set<Flight> access() {
        return new HashSet<>(flightSet);
    }
}