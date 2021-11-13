package com.example.demo.controller;

import com.example.demo.domain.member;
import com.example.demo.service.MemberService;
import lombok.extern.log4j.Log4j2;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
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
    public member join(@RequestBody JSONObject joinData) throws Exception {
        return mService.join(joinData);
    }

    @PostMapping("/findIdByEmail")
    public long findIdByEmail(@RequestParam("email") String email) throws Exception {

        return mService.countByEmailIs(email);
    }

    @PostMapping("/findPwdByInfo")
    public member findPwdByInfo(@RequestBody JSONObject findPwdInfo) throws Exception {
        String username = findPwdInfo.get("username").toString();
        String email = findPwdInfo.get("email").toString();
        return mService.findByUsernameIsAndEmailIs(username, email);
    }

    @PostMapping("/idCheck")
    public boolean idCheck(@RequestParam("username") String username) throws Exception {
        return mService.existsByUsernameIs(username);
    }

    @PostMapping("/toMyPage")
    public boolean toMyPage(@RequestBody JSONObject myPageData) throws Exception {
        return mService.existsByUsernameIsAndPasswordIs(myPageData.get("username").toString(), myPageData.get("password").toString());
    }

    @PostMapping("/updateInfo")
    public int updateInfo(@RequestBody JSONObject updateData, HttpSession session) throws Exception {
        member m = new member();
        m.setUsername(updateData.get("username").toString());
        m.setPassword(updateData.get("password").toString());
        m.setAddress(updateData.get("address").toString());
        m.setIrum(updateData.get("irum").toString());
        m.setEmail(updateData.get("email").toString());
        int result = 0;
        System.out.println("update >>> "+mService.updateInfo(m));
        if(mService.updateInfo(m) != null) {
            session.removeAttribute("loginUser");
            session.setAttribute("loginUser", mService.updateInfo(m));
            result = 1;
        }
        return  result;
    }

    @PostMapping("/exitPage")
    public long exitPage(@RequestBody JSONObject delData) throws Exception {
        System.out.println("회원탈퇴후 데이터 >>> "+ mService.deleteByUsernameIsAndPasswordIs(delData.get("username").toString(), delData.get("password").toString()));
        return mService.deleteByUsernameIsAndPasswordIs(delData.get("username").toString(), delData.get("password").toString());
    }

}
