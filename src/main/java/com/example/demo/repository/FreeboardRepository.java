package com.example.demo.repository;

import com.example.demo.domain.freeboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface FreeboardRepository extends JpaRepository<freeboard, String> {

    @Override
    <S extends freeboard> S save(S entity);

    @Override
    List<freeboard> findAll();

    freeboard findByBnoIs(Integer bno);

    @Transactional
    long deleteByBnoAndUsername(Integer bno, String username);




}
