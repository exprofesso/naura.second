package com.naera.second.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

}