package com.assignments.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class WelcomeControllerTest {

    WelcomeController welcomeController = new WelcomeController();

    @Test
    public void testSaywelcome(){
        String expectedResult= "Welcome from App";
        String result=welcomeController.Saywelcome();
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testrequestWelcome(){
        String expectedResult= "Welcome from request Mapping";
        String result=welcomeController.requestWelcome();
        Assert.assertEquals(expectedResult,result);
    }
}
