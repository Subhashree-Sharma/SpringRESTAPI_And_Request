package com.example.greeting_app.controller;

import com.example.greeting_app.model.Greeting;
import com.example.greeting_app.service.GreetingService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    //Constructor injection
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    //UC 4 - Save a Greeting Message
    @PostMapping("/save")
    public Greeting saveGreeting(@RequestParam String message) {
        return greetingService.saveGreeting(message);
    }

    //UC_05 - Find Greeting by ID
    @GetMapping("/{id}")
    public Greeting getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }
}
