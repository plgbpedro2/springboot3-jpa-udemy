package com.udemyspringboot.springbootproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemyspringboot.springbootproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
