package com.school.tuition.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/date")
    public Date date(){
        return new Date();
    }
}
