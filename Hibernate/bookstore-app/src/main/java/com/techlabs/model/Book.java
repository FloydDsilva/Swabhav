package com.techlabs.model;

import java.sql.Blob;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
@Entity
public class Book {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	private UUID id;
	private String bookName;
	private String category;
	private int quantity;
	private float price;
	private Blob image;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", category=" + category + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
}
