package com.controller.app;
import org.springframework.http.server.RequestPath;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/welcome")
    public String welcome(@RequestParam("name") String name){
        return "Welcome to "+name;
    }

    @GetMapping("/send/{message}")
    public String sendMessage(@PathVariable String message){return  "send message "+message;}

}
