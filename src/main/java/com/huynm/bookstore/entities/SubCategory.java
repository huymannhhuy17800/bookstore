package com.huynm.bookstore.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tblSubCategory")
public class SubCategory implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int id;
	
	private String name;

	@ManyToMany
	@JsonIgnore
	@JoinTable(name = "tblOrderDetail",
			joinColumns=@JoinColumn(name="SubCategoryID"),
			inverseJoinColumns=@JoinColumn(name="bookID"))
	private List<Book> books;
}
