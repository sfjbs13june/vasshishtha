package com.assignments.app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @GetMapping("/Hi")
    public String Sayhi() {
        return "Hi from App";
    }
    @RequestMapping("/request/Hi")
    public String requestHi(){
        return "Hi from request Mapping";
    }

}


