package com.example.demo.controller;

import com.example.demo.domain.freeboard;
import com.example.demo.service.FreeboardService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    public FreeboardService fbService;

    // 자유게시판
    @PostMapping("/write")
    public String boardWrite(@RequestBody JSONObject writeData) throws Exception {
        freeboard fb = new freeboard();
        fb.setTitle(writeData.get("title").toString());
        fb.setContent(writeData.get("content").toString());
        fb.setUsername(writeData.get("writer").toString());
        fbService.save(fb);
        return "success";
    }

    @GetMapping("/read")
    public String freeboardRead(@RequestParam("bno") Integer bno) throws Exception {

        return "location";
    }

    // 영화 추천 게시판

}
