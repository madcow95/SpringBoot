package com.example.demo.service;

import com.example.demo.domain.member;
import com.example.demo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
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

    public List<member> login(@Param("username") String id, @Param("password") String pwd) throws Exception {
        System.out.println("service >>>>>>>>> " + id);
        System.out.println("service >>>>>>>>> " + pwd);
        List<member> m = mRepository.login(id, pwd);
        System.out.println("service >>>>>>>>> " + m);
        return m;
    }

}
