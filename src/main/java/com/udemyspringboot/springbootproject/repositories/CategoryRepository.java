package com.udemyspringboot.springbootproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemyspringboot.springbootproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
