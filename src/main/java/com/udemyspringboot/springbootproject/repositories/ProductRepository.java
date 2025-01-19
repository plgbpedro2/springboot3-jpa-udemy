package com.udemyspringboot.springbootproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemyspringboot.springbootproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
