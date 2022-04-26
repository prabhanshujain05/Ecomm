package com.springboot.mydemo.requestdto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class AddProductDto {
	
	@NotBlank
	private String productName ;
	
	@NotBlank
	private String productDescription;
	
	@NotNull
	private double price;
	
	
	@NotBlank
	private String brand;
	
	@NotBlank
	private String category;

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
		return "AddProductDto [productName=" + productName + ", productDescription=" + productDescription + ", price=" + price + ", supplierId="
				+  ", brand=" + brand + ", category=" + category + "]";
	}

	public AddProductDto(@NotBlank String productName, @NotBlank String productDescription, @NotNull double price,
			 @NotBlank String brand, @NotBlank String category) {
		super();
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
		this.brand = brand;
		this.category = category;
	}

	public AddProductDto() {
		super();
	}
	
	

}
