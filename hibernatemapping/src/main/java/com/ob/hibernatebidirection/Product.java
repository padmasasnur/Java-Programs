package com.ob.hibernatebidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//ManyToOne
@Entity
public class Product {
	@Id
	private int id;
	private String category;
	private String name;
	private double price;
	private int quantity;
	private double rating;
	@ManyToOne
	private ProductCart productcart;
	public Product() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public ProductCart getProductcart() {
		return productcart;
	}
	public void setProductcart(ProductCart productcart) {
		this.productcart = productcart;
	}
	
	
	

}
