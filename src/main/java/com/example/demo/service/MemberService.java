package com.example.demo.service;

import com.example.demo.domain.member;
import com.example.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MemberService {

    @Autowired
    public MemberRepository mRepository;

    public List<member> getMemberList() throws Exception {
        List<member> mList = mRepository.findAll();
        return mList;
    }

    public member findByUsernameAndPassword(@Param("username") String id, @Param("password") String pwd) throws Exception {
        member loginCheck = mRepository.findByUsernameAndPassword(id, pwd);
        return loginCheck;
    }

    public member join(JSONObject joinData) throws Exception {

        member m = new member();
        String username = joinData.get("username").toString();
        String password = joinData.get("password").toString();
        String irum = joinData.get("irum").toString();
        String email = joinData.get("email").toString();
        String address = joinData.get("address").toString();
        m.setUsername(username);
        m.setPassword(password);
        m.setIrum(irum);
        m.setEmail(email);
        m.setAddress(address);

        return mRepository.save(m);
    }

    public long countByEmailIs(@Param("email") String email) throws Exception {
        return mRepository.countByEmailIs(email);
    }

    public member findByUsernameIsAndEmailIs(@Param("username") String username, @Param("email") String email) throws Exception {
        return mRepository.findByUsernameIsAndEmailIs(username, email);
    }

}
