package com.example.greeting_app.controller;
import com.example.greeting_app.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    //Constructor injection
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    //UC_01 (Commented out)
    /*
    @GetMapping
    public String getGreeting() {
        return "Hello, Welcome to the Greeting App!";
    }
    */

    //UC_02 - GET Request - Returns greeting from Service Layer
    @GetMapping("/message")
    public String getServiceGreeting() {
        return greetingService.getGreetingMessage();
    }
}
