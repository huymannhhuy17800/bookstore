package com.huynm.bookstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.huynm.bookstore.dto.OrderDTO;
import com.huynm.bookstore.entities.Order;
import com.huynm.bookstore.repository.OrderRepository;
import com.huynm.bookstore.service.OrderService;

public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	@Override
	public void saveOrder(Order order) {
		// TODO Auto-generated method stub
		orderRepository.save(order);
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public List<Order> showOrderByUserID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrder(int userID) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
