package com.calc.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
@GetMapping("/add")
    public double add(@RequestParam("a") double a, @RequestParam("b") double b){
    return a+b;
    }
}


