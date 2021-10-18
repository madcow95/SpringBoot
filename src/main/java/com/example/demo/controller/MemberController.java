package com.example.demo.controller;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {

    @PostMapping("/join")
    public String join(@RequestBody JSONObject joinData) {
        System.out.println(("username >>> "+ joinData.get("username")));
        return "joinSuccess";
    }

    @PostMapping("/login")
    public String login(@RequestBody JSONObject loginData) {
        System.out.println("username >>> " + loginData.get("username"));
        return "loginSuccess";
    }

    @PostMapping("/findIdByEmail")
    public String findIdByEmail(@RequestParam("email") String email) {
        System.out.println("find info email >>> " + email);
        return "ok";
    }

    @PostMapping("/findPwdByInfo")
    public String findPwdByInfo(@RequestBody JSONObject findPwdInfo) {
        System.out.println("username >>> " + findPwdInfo);
        return "okok";
    }
}
