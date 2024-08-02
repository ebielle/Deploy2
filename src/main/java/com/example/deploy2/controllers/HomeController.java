package com.example.deploy2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/name")
    public String helloName(){
        String devName = "Erika";
        return devName;
    }
}