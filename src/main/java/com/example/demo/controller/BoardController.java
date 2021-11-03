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

    @PostMapping("/delete")
    public Long boardModify(@RequestBody JSONObject delData) throws Exception {
        Integer bno = Integer.valueOf(delData.get("bno").toString());
        String username = delData.get("writer").toString();
        System.out.println("bno >>> " + bno);
        System.out.println("writer >>>" + username);
        Long result = fbService.deleteByBnoAndUsername(bno, username);
        System.out.println(result);
        return result;
    }

    // 영화 추천 게시판

}
