package com.controller.app;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping("/hello")
    public String Sayhello(){
        return "Hello from App";
    }

@RequestMapping("/request/Hello")
public String requestHello(){
        return "Hello from request Mapping";
}

}
