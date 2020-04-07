package com.kodilla.testing.calculator;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Integer add =  calculator.add(5,3);
        Integer subtract = calculator.subtract(6,3);

        if (add.equals(8)) {
            System.out.println("Test ok");

        }else {
            System.out.println("Error!");
        }

        if (subtract.equals(3) ) {
            System.out.println("Test ok");

        }else {
            System.out.println("Error!");
        }


    }
}