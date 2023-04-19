package com.huynm.bookstore.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tblOrder")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	private float total; 
	
	@ManyToOne
	private User user;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "OrderDetail",joinColumns=@JoinColumn(name="orderID"),
				inverseJoinColumns=@JoinColumn(name="BookID"))
	private List<Book> books;
	
}
