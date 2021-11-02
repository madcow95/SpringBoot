package com.example.demo.controller;

import com.example.demo.domain.freeboard;
import com.example.demo.service.FreeboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/boardRead")
public class BoardReadController {

    @Autowired
    public FreeboardService fbService;

    @GetMapping("/freeboardRead")
    public String freeboardRead(@RequestParam("bno") Integer bno, Model model) throws Exception {
        freeboard fb = fbService.findByBnoIs(bno);
        model.addAttribute("freeboardRead", fb);
        return "board/read";
    }
}
