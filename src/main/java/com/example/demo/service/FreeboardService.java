package com.example.demo.service;

import com.example.demo.domain.freeboard;
import com.example.demo.repository.FreeboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreeboardService {

    @Autowired
    public FreeboardRepository fbRepository;

    public void save(freeboard fb) throws Exception {
        fbRepository.save(fb);
    }

    public List<freeboard> findAll() throws Exception {
        return fbRepository.findAll();
    }
}
