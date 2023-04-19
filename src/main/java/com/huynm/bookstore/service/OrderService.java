package com.huynm.bookstore.service;

import java.util.List;

import com.huynm.bookstore.dto.OrderDTO;
import com.huynm.bookstore.entities.Order;

public interface OrderService {

	void saveOrder(Order order);
	
	List<Order> getAllOrder();
	
	List<Order> showOrderByUserID(int id);
	
	Order getOrder(int userID);
}
