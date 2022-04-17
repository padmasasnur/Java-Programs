package com.ob.hibernatebidirection;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.ob.hibernateonetomany.Item;

//OneToMany
@Entity
public class ProductCart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@OneToMany(cascade=CascadeType.PERSIST)
	private List<Product> product;
	
	public ProductCart() {
		super();
	}

	public ProductCart(int id, List<Product> product) {
		super();
		this.id = id;
		this.product = product;
	}

	public int getId() {
		return id;
	}


	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	

	
	

}
