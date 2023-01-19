package com.controller.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HelloControllerTest {

    HelloController helloController =new HelloController();


    @Test
    public void testrequestWelcome(){
        String name= "world";
        String expectedResult= "Welcome to "+name;
        String result=helloController.welcome(name);
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testrequestSendMessage(){
        String message= "world";
        String expectedResult= "send message to "+message;
        String result=helloController.sendMessage(message);
        Assert.assertEquals(expectedResult,result);
    }
}
