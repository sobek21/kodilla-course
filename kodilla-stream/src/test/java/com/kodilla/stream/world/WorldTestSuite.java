package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
   public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country("Poland",new BigDecimal("10"));
        Country german = new Country("Germany",new BigDecimal("20"));

        Country china = new Country("China",new BigDecimal("30"));
        Country mongolia = new Country("Mongolia",new BigDecimal("20"));

        Continent europe = new Continent("europe");
        europe.addCountry(poland);
        europe.addCountry(german);

        Continent asia = new Continent("asia");
        asia.addCountry(china);
        asia.addCountry(mongolia);

        World world = new World();
        world.addContinents(europe);
        world.addContinents(asia);
        //when
        BigDecimal howMany = world.getPeopleQuantity();
        //then
        Assert.assertEquals(new BigDecimal("80"),howMany);
    }
}
