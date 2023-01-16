package com.assignments.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String Saywelcome() {
        return "Welcome from App";
    }
    @RequestMapping("/request/welcome")
    public String requestWelcome(){
        return "Welcome from request Mapping";
    }

}
