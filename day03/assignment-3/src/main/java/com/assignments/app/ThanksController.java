package com.assignments.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThanksController {
    @GetMapping("/thanks")
    public String Saythanks() {
        return "Thanks from App";
    }
        @RequestMapping("/request/thanks")
        public String requestThanks(){
            return "Thanks from request Mapping";
        }
}

