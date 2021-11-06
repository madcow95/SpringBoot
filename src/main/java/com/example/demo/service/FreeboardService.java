package com.example.demo.service;

import com.example.demo.domain.freeboard;
import com.example.demo.repository.FreeboardRepository;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreeboardService {

    @Autowired
    public FreeboardRepository fbRepository;

    public freeboard save(JSONObject joinObj) throws Exception {
        freeboard fb = new freeboard();
        fb.setTitle(joinObj.get("title").toString());
        fb.setContent(joinObj.get("content").toString());
        fb.setUsername(joinObj.get("writer").toString());
        fb.setReadcount(0);
        return fbRepository.save(fb);
    }

    public void saveModify(freeboard fb) throws Exception {
        fbRepository.save(fb);
    }

    public List<freeboard> findAll() throws Exception {
        return fbRepository.findAll();
    }

    public freeboard findByBnoIs(Integer bno) throws Exception {
        return fbRepository.findByBnoIs(bno);
    }

    public Long deleteByBnoAndUsername(Integer bno, String username) throws Exception {
        return fbRepository.deleteByBnoAndUsername(bno, username);
    }
}
