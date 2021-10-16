package com.example.demo.service.impl;

import com.example.demo.mapper.MemberMapper;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    public MemberMapper mMapper;

    @Override
    public int login(Map<String, String> loginMap) throws Exception {
        return 0;
    }
}