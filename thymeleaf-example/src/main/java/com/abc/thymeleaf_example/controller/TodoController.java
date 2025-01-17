package com.abc.thymeleaf_example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {
    @GetMapping
    public String indexPage(Model model) {
        model.addAttribute("header", "TODO LIST");
        model.addAttribute("description", "Make your life easier");
        return "index";
    }
}
