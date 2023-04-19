package com.huynm.bookstore.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tblOrderDetail")
public class OrderDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private float price;
	
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name = "orderID")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "bookID")
	private Book book;
	
}
