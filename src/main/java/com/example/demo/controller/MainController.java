package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

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
    public String freeBoard(){ return "/board/freeBoard"; }
    @GetMapping("/findInfo")
    public String findInfo() { return "/member/findInfo"; }
    @GetMapping("/createBoard")
    public String createBoard() { return "/board/write"; }
    @GetMapping("/read")
    public String readBoard() { return "/board/read"; }
}
