package com.assignments.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class GreetingControllerTest {

    GreetingController greetingController = new GreetingController();

    @Test
    public void testSaygreet(){
        String expectedResult= "Greeting from App";
        String result=greetingController.Saygreet();
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testrequestGreet(){
        String expectedResult= "Greeting from request Mapping";
        String result=greetingController.requestGreet();
        Assert.assertEquals(expectedResult,result);
    }


}
