package com.example.demo.controller;

import com.example.demo.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/member")
public class MemberController {

    @PostMapping("/join")
    public String join(@RequestParam("username") String username,
                       @RequestParam("password") String password,
                       @RequestParam("irum") String irum,
                       @RequestParam("email") String email,
                       @RequestParam("address") String address,
                       @RequestParam("addressDetail") String addressDetail) {
        System.out.println(("username >>> "+ username));
        System.out.println(("password >>> "+ password));
        System.out.println(("irum >>> "+ irum));
        System.out.println(("email >>> "+ email));
        System.out.println(("address >>> "+ address));
        System.out.println(("addressDetail >>> "+ addressDetail));
        return "home";
    }
}
