package com.example.demo.repository;

import com.example.demo.domain.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<product, String> {
}
