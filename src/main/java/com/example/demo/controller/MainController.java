package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping("/home")
    public String sampleTest() {
        return "home";
    }

    @GetMapping("/login")
    public String sampleTest2(Model model) {
        model.addAttribute("name", "이걸 또하고 있을줄이야");
        return "login";
    }
}
