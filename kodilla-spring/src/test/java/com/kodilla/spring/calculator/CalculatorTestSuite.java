package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 9;
        double b = 3;
     //Then
    double addResult = calculator.add(a,b);
    double subResult = calculator.sub(a,b);
    double mulResult = calculator.mul(a,b);
    double divResult = calculator.div(a,b);
    //When
      Assert.assertEquals(12.0,addResult,0.1);
      Assert.assertEquals(6.0,subResult,0.1);
      Assert.assertEquals(27.0,mulResult,0.1);
      Assert.assertEquals(3.0,divResult,0.1);
    }
}
