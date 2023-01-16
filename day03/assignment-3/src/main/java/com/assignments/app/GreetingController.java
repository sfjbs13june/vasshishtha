package com.assignments.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greet")
    public String Saygreet() {
        return "Greeting from App";
    }
    @RequestMapping("/request/greet")
    public String requestGreet(){
        return "Greeting from request Mapping";
    }
}




