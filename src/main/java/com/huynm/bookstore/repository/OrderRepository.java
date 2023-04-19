package com.huynm.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huynm.bookstore.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{
}
