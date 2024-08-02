package com.example.deploy2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private Environment environment;

    @Value("${myDevNameTree.devName}")
    String myDevName;

    @GetMapping("/hello")
    public String getHello(){
        return "Hello!";
    }

    @GetMapping("/")
    public String mainEndpoint(){
        String var = environment.getProperty("myDevNameTree.devName");
        return var;
    }

    @GetMapping("/other-injection")
    public String mainEndpointII(){
        return myDevName;
    }
}