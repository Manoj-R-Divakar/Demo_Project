package com.example.demo_java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController{

    @GetMapping("/check")
    public String checkBackend() {
        return "Main Page";
    }

    @GetMapping("/pavan")
    public String pavanMethod(){return "pavan did this";}

    @GetMapping("/method1")
    public String method1(){return "method1";}
}
