package com.huynm.bookstore.dto;

import com.huynm.bookstore.entities.Order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderDTO {

	private int id;
	
	private float total;
	
	
	public Order convertToEntity() {
		Order order = new Order();
		order.setId(this.id);
		order.setTotal(this.total);
		return order;
	}
}
