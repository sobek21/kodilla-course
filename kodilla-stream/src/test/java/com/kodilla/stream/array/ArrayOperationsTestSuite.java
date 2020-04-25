package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
   public void testGetAverage(){

        //Given
        int[] tab = {2,4,6,8,10,12,14,16,18,20};
        //when
        double result = ArrayOperations.getAverage(tab);
       //then
        Assert.assertEquals(11,result,0.001);
    }
}
