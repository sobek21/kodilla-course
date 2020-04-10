package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList()
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        OddNumbersExterminator test = new OddNumbersExterminator();

        Assert.assertEquals(test.exterminate(numbers), numbers);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> Number = new ArrayList<Integer>();
        for(int i = 0; i<10; i++){
            Number.add(i);
        }
        ArrayList<Integer> evenNumber = new ArrayList<Integer>();
        for(int i = 0; i<10; i = i +2){
         evenNumber.add(i);
        }

        OddNumbersExterminator test = new OddNumbersExterminator();

        Assert.assertEquals(evenNumber,test.exterminate(Number));
    }
}
