package com.faizan.cicdapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello Faizan 🚀 Spring Boot CI/CD Pipeline Running!";
    }
}
