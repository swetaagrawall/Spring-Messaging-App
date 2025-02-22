package com.example.SpringMessagingApplication.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessagingApplication {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello From Bridgelabz";
    }
    @GetMapping("/hello/query")
    public String fetchName(@RequestParam String name){
        return "Hello "+name;
    }

}
