package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${spring.dash-api-url}")
    private String dashApiUrl;

    @GetMapping("/")
    public String home() {
        return "Hello! I'm a Spring Boot application! Dash API URL is: " + dashApiUrl;
    }
}
