package com.example.demo.controller;

import com.example.demo.domain.member;
import com.example.demo.service.MemberService;
import lombok.extern.log4j.Log4j2;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/member")
@Log4j2
public class MemberController {

    @Autowired
    public MemberService mService;

    @PostMapping("/join")
    public String join(@RequestBody JSONObject joinData) {
        System.out.println(("username >>> "+ joinData.get("username")));
        return "joinSuccess";
    }

    @PostMapping("/login")
    public String login(@RequestBody JSONObject loginData) throws Exception {
        String username = loginData.get("username").toString();
        String password = loginData.get("password").toString();
        List<member> m = mService.login(username, password);
        System.out.println("controllers member r>>> " + m.get(0).getAddress());
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

    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE }, value = "/test")
    public ResponseEntity<List<member>> getAllmembers() throws Exception {
        List<member> mList = mService.getMemberList();
        return new ResponseEntity<List<member>>(mList, HttpStatus.OK);
    }

}
