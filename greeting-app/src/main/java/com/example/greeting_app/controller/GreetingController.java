package com.example.greeting_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class GreetingController {

    @GetMapping("/greet")
    public String greet(){
        return "learning dockerize spring boot project";
    }
}
