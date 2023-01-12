package com.vasi.app;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;

public class AppTest extends TestCase
{
    @Test
    public void testSayHi(){
        String expectedResult= "Hi from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.sayHi();
        Assert.assertEquals(expectedResult,result);
    }
    public void testSayHello(){
        String expectedResult= "Hello from greeting";
        Greeting greeting =new Greeting();
        String hello_result= greeting.sayHello();
        Assert.assertEquals(expectedResult,hello_result);
    }
    public void testSayWelcome(){
        String expectedResult= "Welcome from greeting";
        Greeting greeting =new Greeting();
        String welcome_result= greeting.sayWelcome();
        Assert.assertEquals(expectedResult,welcome_result);
    }
    public void testSayBye(){
        String expectedResult= "bye from greeting";
        Greeting greeting =new Greeting();
        String bye_result= greeting.sayBye();
        Assert.assertEquals(expectedResult,bye_result);
    }
}
