package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        // Testing Calculator class
        Calculator calculator = new Calculator();
        int addResult = calculator.add(10, 5);
        int subResult = calculator.subtract(10, 5);

        if (addResult == 15 && subResult == 5) {
            System.out.println("Test ok");
        }else {
            System.out.println("Test error");
        }

        }
    }
