package com.example.greeting_app.service;
import com.example.greeting_app.model.Greeting;
import com.example.greeting_app.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    //UC_04
    public String getGreetingMessage() {
        return "Hello World!";
    }

    public Greeting saveGreeting(String message) {
        Greeting greeting = new Greeting(message);
        return greetingRepository.save(greeting);
    }

    //UC_05
    //Fetch greeting by ID
    public Greeting getGreetingById(Long id) {
        return greetingRepository.findById(id).orElse(null);
    }

    //UC_06 - Fetch all greetings
    public List<Greeting> getAllGreetings() {
        List<Greeting> greetings = greetingRepository.findAll();
        System.out.println("Fetched Greetings: " + greetings); // Debug log
        return greetings;
    }

}
