package com.example.springtutorialex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HellowController {
    @GetMapping("/")
    public String helloWorld(){
        return "home.html";
    }
//
    @RequestMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("home");
        modelAndView.addObject("firstName","sanwar");
        modelAndView.addObject("lastName","jayswal");

        return  modelAndView;
    }
}
