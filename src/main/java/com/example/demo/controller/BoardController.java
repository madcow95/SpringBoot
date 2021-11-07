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
    public freeboard boardWrite(@RequestBody JSONObject inputData) throws Exception {
        freeboard fb = new freeboard();
        fb.setTitle(inputData.get("title").toString());
        fb.setContent(inputData.get("content").toString());
        fb.setUsername(inputData.get("writer").toString());
        fb.setReadcount(0);
        fb = fbService.save(fb);
        return fb;
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

    @PostMapping("/modify")
    public void freeBoardModify(@RequestBody JSONObject modifyData) throws Exception {
        freeboard fb = new freeboard();
        fb.setBno(Integer.valueOf(modifyData.get("bno").toString()));
        fb.setTitle(modifyData.get("title").toString());
        fb.setContent(modifyData.get("content").toString());
        fb.setUsername(modifyData.get("writer").toString());
        fb.setReadcount(Integer.valueOf(modifyData.get("readCount").toString()));
        fbService.saveModify(fb);
    }

    // 영화 추천 게시판

}
