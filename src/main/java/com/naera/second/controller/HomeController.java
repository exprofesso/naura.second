package com.naera.second.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//@Controller

@EnableWebMvc
@Configuration
public class HomeController implements WebMvcConfigurer {
//
//    @GetMapping("/hello")
//    public String hello() {
//        return "hello";
//    }
//
//    @GetMapping("/home")
//    public String home() {
//        return "home";
//    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
       registry.addViewController("/login").setViewName("login");
    }

}