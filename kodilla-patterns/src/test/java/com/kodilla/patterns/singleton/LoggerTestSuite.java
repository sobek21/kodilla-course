package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
   public void getLastLog() {
       String log1 = "test1";
       String log2 = "test2";

       Logger.getInstance().log(log1);
       Logger.getInstance().log(log2);

        Assert.assertEquals(log2,Logger.getInstance().getLastLog());
    }
}
