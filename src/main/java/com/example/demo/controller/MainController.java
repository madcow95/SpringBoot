package com.example.demo.controller;

import com.example.demo.domain.freeboard;
import com.example.demo.service.FreeboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    public FreeboardService fbService;

    @GetMapping("/home")
    public String home() { return "home"; }
    @GetMapping("/login")
    public String login() {
        return "member/login";
    }
    @GetMapping("/join")
    public String join() {
        return "member/join";
    }
    @GetMapping("/board")
    public String board(){ return "/board/board"; }
    @GetMapping("/freeBoard")
    public String freeBoard(Model model) throws Exception{
        model.addAttribute("freeBoardList", fbService.findAll());
        return "/board/freeBoard";
    }
    @GetMapping("/findInfo")
    public String findInfo() { return "/member/findInfo"; }
    @GetMapping("/createBoard")
    public String createBoard() { return "/board/write"; }
    @GetMapping("/read")
    public String readBoard() { return "/board/read"; }
}
