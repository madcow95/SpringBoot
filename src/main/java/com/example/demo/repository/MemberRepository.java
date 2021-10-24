package com.example.demo.repository;

import com.example.demo.domain.member;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends CrudRepository<member, String> {

    @Query("SELECT username, password, irum, email, address FROM member WHERE username='test'")
    public List<member> mList() throws  Exception;
}
