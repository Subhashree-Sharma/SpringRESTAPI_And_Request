package com.example.greeting_app.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    //UC_02
    public String getGreetingMessage() {
        return "Hello World!";
    }

    //UC_03
    public String getPersonalizedGreeting(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello, " + firstName + " " + lastName + "!";
        } else if (firstName != null) {
            return "Hello, " + firstName + "!";
        } else if (lastName != null) {
            return "Hello, " + lastName + "!";
        }
        return getGreetingMessage();
    }
}
