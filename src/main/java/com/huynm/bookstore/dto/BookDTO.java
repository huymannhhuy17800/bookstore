package com.huynm.bookstore.dto;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.huynm.bookstore.entities.Book;

import com.huynm.bookstore.entities.SubCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO {

	private int id;

	private String name;

	private float originalPrice;

	private float salePrice;

	private Date publishedDate;

	private String description;

	private String authors;

	private String format;

	private int pages;
	
	private int quantity;

	private List<SubCategory> categories;

	private List<ImageDTO> imgs;

	public Book convertToEntity() {
		Book book = new Book();
		book.setId(this.id);
		book.setName(this.name);
		book.setOriginalPrice(this.originalPrice);
		book.setSalePrice(this.salePrice);
		book.setAuthors(this.authors);
		book.setDescription(this.description);
		book.setFormat(this.format);
		book.setPublishedDate(this.publishedDate);
		book.setQuantity(this.quantity);
		book.setPages(this.pages);
		book.setCategories(this.categories);
		return book;
	}

}
