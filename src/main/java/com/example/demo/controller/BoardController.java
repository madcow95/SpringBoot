package com.example.demo.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
public class BoardController {

    @PostMapping("/write")
    public String boardWrite(@RequestBody JSONObject writeData) {
        System.out.println(writeData);
        return "success";
    }

}
