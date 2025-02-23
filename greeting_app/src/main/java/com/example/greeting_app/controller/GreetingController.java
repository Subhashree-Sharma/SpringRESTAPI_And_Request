package com.example.greeting_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    // GET Request - Returns a simple greeting message
    @GetMapping
    public String getGreeting() {
        return "Hello, Welcome to the Greeting App!";
    }
}
