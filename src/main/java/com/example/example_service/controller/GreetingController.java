package com.example.example_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Bengaluru Engineer!";
    }
}
