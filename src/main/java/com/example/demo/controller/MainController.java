package com.example.demo.controller;

import com.example.demo.domain.freeboard;
import com.example.demo.domain.member;
import com.example.demo.service.FreeboardService;
import com.example.demo.service.MemberService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    public FreeboardService fbService;

    @Autowired
    public MemberService mService;

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

    @PostMapping("/login")
    public @ResponseBody Integer login(@RequestBody JSONObject loginData, HttpSession session) throws Exception {
        member loginCheck = mService.findByUsernameAndPassword(loginData.get("username").toString(), loginData.get("password").toString());
        Integer result = 0;
        if(loginCheck == null) {
            result = 0;
        } else {
            result = 1;
            member m = new member();
            m.setUsername(loginCheck.getUsername());
            m.setPassword(loginCheck.getPassword());
            m.setIrum(loginCheck.getIrum());
            m.setEmail(loginCheck.getEmail());
            m.setAddress(loginCheck.getAddress());
            session.setAttribute("loginUser", m);
        }
        return result;
    }
}
