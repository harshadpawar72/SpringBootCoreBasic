package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public String sayHello()
    {
        return "Welcome";
    }
    @GetMapping("/service")
    public String sayService()
    {
        return "Full Stack Java Devloper";
    }
    @GetMapping("/myname")
    public  String m1()
    {
        return "AKSHAY PARDESHI..!";
    }
}
