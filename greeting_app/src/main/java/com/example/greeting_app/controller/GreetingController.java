package com.example.greeting_app.controller;
import com.example.greeting_app.model.Greeting;
import com.example.greeting_app.service.GreetingService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

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

    //UC_06 - List all Greeting Messages
    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        //Call Service method
        return greetingService.getAllGreetings();
    }

    //UC_07 - Update a Greeting Message
    @PutMapping("/update/{id}")
    public Greeting updateGreeting(@PathVariable Long id, @RequestParam String message) {
        return greetingService.updateGreeting(id, message);
    }

    //UC_08
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteGreeting(@PathVariable Long id) {
        greetingService.deleteGreeting(id);
        return ResponseEntity.ok("Greeting deleted successfully.");
    }

}
