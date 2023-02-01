package com.huynm.bookstore.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tblBook")
public class Book {

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
	private String image;
	
	//private SubCategory subCategory;

	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, float originalPrice, float salePrice, Date publishedDate, String description,
			String authors, String bFormat, int pages, int quantity, String image) {
		super();
		this.id = id;
		this.name = name;
		this.originalPrice = originalPrice;
		this.salePrice = salePrice;
		this.publishedDate = publishedDate;
		this.description = description;
		this.authors = authors;
		this.bFormat = bFormat;
		this.pages = pages;
		this.quantity = quantity;
		this.image = image;
		//this.subCategory = subCategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(float originalPrice) {
		this.originalPrice = originalPrice;
	}

	public float getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getbFormat() {
		return bFormat;
	}

	public void setbFormat(String bFormat) {
		this.bFormat = bFormat;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

//	public SubCategory getSubCategory() {
//		return subCategory;
//	}

//	public void setSubCategory(SubCategory subCategory) {
//		this.subCategory = subCategory;
//	}
	
	
}
