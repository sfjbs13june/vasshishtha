package com.vasi.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        String hi = greeting.sayHi();
        String hello = greeting.sayHello();
        String welcome = greeting.sayWelcome();
        String bye = greeting.sayBye();
        System.out.println(hi);
        System.out.println(hello);
        System.out.println(welcome);
        System.out.println(bye);
    }
}