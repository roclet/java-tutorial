package com.lijoce.apilijoce.repository;

import com.lijoce.apilijoce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> { }
