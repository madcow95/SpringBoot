package com.example.demo.repository;

import com.example.demo.domain.member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<member, String> {

    member findByUsernameAndPassword(String username, String password);

    @Override
    <S extends member> S save(S entity);

    long countByEmailIs(String email);

    member findByUsernameIsAndEmailIs(String username, String email);

    boolean existsByUsernameIs(String username);

    boolean existsByUsernameIsAndPasswordIs(String username, String password);

    long deleteByUsernameIsAndPasswordIs(String username, String password);



}
