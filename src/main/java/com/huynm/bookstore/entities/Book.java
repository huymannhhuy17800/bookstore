package com.huynm.bookstore.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Entity
@NoArgsConstructor
@Table(name = "tblBook")
public class Book implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "originalPrice")
	private float originalPrice;
	
	@Column(name = "salePrice")
	private float salePrice;
	
	@Column(name = "datePublished")
	private Date publishedDate;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "authors")
	private String authors;
	
	@Column(name = "bFormat")
	private String Format;
	
	@Column(name = "pages")
	private int pages; 
	
	@Column(name = "quantity")
	private int quantity;
	
	@OneToMany(mappedBy = "book",cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Image> images;
	
	@ManyToMany
	@JoinTable(name = "tblOrderDetail",
	joinColumns=@JoinColumn(name="BookID"),
	inverseJoinColumns=@JoinColumn(name="OrderID"))
	@JsonIgnore
	private List<Order> orders;
	
	
}
