package com.controller.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class helloControllerTest {
    helloController helloController = new helloController();
    @Test
    public void testSayhello()
    {
        String expectedResult = "Hello from App";
        String result = helloController.Sayhello();
        Assert.assertEquals(expectedResult,result);
    }


    @Test
    public void testrequestHello()
    {
        String expectedString = "Hello from request Mapping";
        String result = helloController.requestHello();
        Assert.assertEquals(expectedString,result);
    }
}


