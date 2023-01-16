package com.assignments.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class HiControllerTest {
    HiController hiController = new HiController();

    @Test
    public void testSayHi(){
        String expectedResult= "Hi from App";
        String result=hiController.Sayhi();
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testrequestHi(){
        String expectedResult= "Hi from request Mapping";
        String result=hiController.requestHi();
        Assert.assertEquals(expectedResult,result);
    }


}
