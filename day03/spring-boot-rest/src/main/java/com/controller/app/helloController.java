package com.controller.app;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class helloController {
    @GetMapping("/hello")
    public String Sayhello(){
        return "hello from app";
    }

@RequestMapping("/request/hello")
public String requesthello(){
        return "hello from request mapping";
}

}
