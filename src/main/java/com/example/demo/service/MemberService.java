package com.example.demo.service;

import com.example.demo.domain.member;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    public MemberRepository mRepository;

    public List<member> getMemberList() throws Exception {

        List<member> mList = new ArrayList<>();
        mRepository.mList().forEach(data -> mList.add(data));
        return mList;
    }
}
