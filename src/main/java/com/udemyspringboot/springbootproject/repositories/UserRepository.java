package com.udemyspringboot.springbootproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemyspringboot.springbootproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
