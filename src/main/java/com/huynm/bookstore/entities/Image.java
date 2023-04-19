package com.huynm.bookstore.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name = "tblImage")
public class Image implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "image_link")
	private String link;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "book_id")
	private Book book;

	@Override
	public String toString() {
		return "Image [id=" + id + ", link=" + link + ", book=" + book + "]";
	}
	
	
}
