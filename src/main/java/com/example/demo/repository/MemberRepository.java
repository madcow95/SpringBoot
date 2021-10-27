package com.example.demo.repository;

import com.example.demo.domain.member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<member, String> {

    @Query("SELECT m.username, m.password, m.irum, m.email, m.address FROM member m")
    public List<member> mList() throws Exception;
}
