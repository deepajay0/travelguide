package com.travel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TravelController {
    @GetMapping("/")
    public String homePage(){
        return "index";
    }
    @PostMapping("/login")
    public String loginPage(){
        return "login";
    }
}
