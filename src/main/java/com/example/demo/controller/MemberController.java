package com.example.demo.controller;

import com.example.demo.domain.member;
import com.example.demo.service.MemberService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    public MemberService mService;

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

    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE }, value = "/test")
    public ResponseEntity<List<member>> getAllmembers() throws Exception {
        List<member> mList = mService.getMemberList();
        for(int i = 0; i < mList.size(); i++) {
            System.out.println(mList.get(i));
        }
        return new ResponseEntity<List<member>>(mList, HttpStatus.OK);
    }

}
