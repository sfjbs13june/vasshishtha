package com.assignments.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ThanksControllerTest {

    ThanksController thanksController = new ThanksController();

    @Test
    public void testSayThanks(){
        String expectedResult= "Thanks from App";
        String result=thanksController.Saythanks();
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testrequestThanks(){
        String expectedResult= "Thanks from request Mapping";
        String result=thanksController.requestThanks();
        Assert.assertEquals(expectedResult,result);
    }
}
