package com.example.demo.repository;

import com.example.demo.domain.MemberDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<MemberDTO, String> {

    public List<MemberDTO> mList() throws  Exception;
}
