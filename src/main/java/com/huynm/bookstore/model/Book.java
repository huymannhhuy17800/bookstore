package com.huynm.bookstore.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tblBook")
public class Book implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
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
	private String bFormat;
	
	@Column(name = "pages")
	private int pages; 
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "bImage")
	private String imageName;
		
	
	
	
}
