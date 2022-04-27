package com.springboot.mydemo.model.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.springboot.mydemo.model.support.IbSupport;

@Entity
public class Product extends IbSupport{
	@Id
	@GeneratedValue(generator = "product_generator")
	@SequenceGenerator(
			name = "product_generator",
			sequenceName = "product_sequence",
			initialValue = 10000
			)
	private int id;
	
	
	private String productName;
	
	private String productDescription;
	
	private double price;
	
	private long supplierId;
	
	private String brand;
	
	private String category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productDescription=" + productDescription
				+ ", price=" + price + ", supplierId=" + supplierId + ", brand=" + brand + ", category=" + category
				+ "]";
	}

	public Product(int id, String productName, String productDescription, double price, long supplierId, String brand,
			String category) {
		super();
		this.id = id;
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
		this.supplierId = supplierId;
		this.brand = brand;
		this.category = category;
	}

	public Product() {
		super();
	}
	
}
