package com.springboot.mydemo.service;

import com.springboot.mydemo.model.supplier.Supplier;
import com.springboot.mydemo.requestdto.AddProductDto;
import com.springboot.mydemo.requestdto.SupplierLoginDto;
import com.springboot.mydemo.requestdto.SupplierRegisterDto;


public interface SupplierService {
	
	public void supplierRegistration(SupplierRegisterDto supplierServiceDto);
	
	public Supplier supplierLogin(SupplierLoginDto supplierLoginDto);
	
	public void addProduct(String suppplierId, AddProductDto addProductDto);
	
	public void updateProduct(int Id,AddProductDto addProductDto);
	
	public void deleteProduct(int productId);
	

}
