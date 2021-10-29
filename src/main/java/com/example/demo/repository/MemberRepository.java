package com.example.demo.repository;

import com.example.demo.domain.member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends JpaRepository<member, String> {

    @Query("SELECT m.username, m.password, m.irum, m.email, m.address FROM member m WHERE m.username = :id AND m.password = :pwd")
    List<member> login(@Param("id") String username,
                 @Param("pwd") String password) throws Exception;
}
