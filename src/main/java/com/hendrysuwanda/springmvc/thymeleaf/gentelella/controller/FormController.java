package com.hendrysuwanda.springmvc.thymeleaf.gentelella.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

    @RequestMapping("/form")
    public String form(){
        return "form";
    }

    @RequestMapping("/form_advanced")
    public String formAdvanced(){
        return "form_advanced";
    }
}
