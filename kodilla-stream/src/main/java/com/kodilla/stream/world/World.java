package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class World {

   private final Set<Continent> continents = new HashSet<Continent>();

   public void addContinents(Continent continent){
       continents.add(continent);}

    public Set<Continent> getContinents() {
        return continents;}

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(c -> c.getCountryList().stream())
                .map(c -> c.getPeopleQuanity())
                .reduce(BigDecimal.ZERO, (people,sum) -> sum.add(people));}
}
