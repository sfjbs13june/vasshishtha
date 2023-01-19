package com.calc.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestParam;

public class AddControllerTest {
AddController addController = new AddController();

    @Test
    public void testrequestAdd(){
        double a= "2";
        double b= "3";
        String expectedResult= 5;
        String result=addController.add(a,b);
        Assert.assertEquals(expectedResult,result);
    }


}
