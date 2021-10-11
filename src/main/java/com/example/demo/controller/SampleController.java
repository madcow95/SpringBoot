package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {
    @GetMapping("/first")
    public String sampleTest(Model model) {
        model.addAttribute("name", "최광우");
        return "sample";
    }

    @GetMapping("/second")
    public String sampleTest2(Model model) {
        model.addAttribute("name", "이걸 또하고 있을줄이야");
        return "secondSample";
    }
}
