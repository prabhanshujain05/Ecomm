package com.springboot.mydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mydemo.dao.product.ProductRepository;
import com.springboot.mydemo.dao.supplier.SupplierRepository;
import com.springboot.mydemo.model.product.Product;
import com.springboot.mydemo.model.supplier.Supplier;
import com.springboot.mydemo.requestdto.AddProductDto;
import com.springboot.mydemo.requestdto.SupplierLoginDto;
import com.springboot.mydemo.requestdto.SupplierRegisterDto;

@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	SupplierRepository supplierRepository;
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public void supplierRegistration(SupplierRegisterDto supplierRegisterDto) {
		
		Supplier supp = new Supplier();
		
		
		supp.setName(supplierRegisterDto.getName());
		supp.setPassword(supplierRegisterDto.getPassword());
		supp.setContactNumber(supplierRegisterDto.getContactNumber());
		supp.setAddress(supplierRegisterDto.getAddress());
		supp.setCity(supplierRegisterDto.getCity());
		supp.setPostalCode(supplierRegisterDto.getPostaCode());
		supp.setMailId(supplierRegisterDto.getMailId());
		
		supplierRepository.save(supp);

	}
	
	public Supplier supplierLogin(SupplierLoginDto supplierLoginDto) { 
		
		Supplier supp = supplierRepository.findBymailIdAndPassword(supplierLoginDto.getMailId(), supplierLoginDto.getPassword());
		System.out.println(supp);
		
		if(supp!=null)
		{
			return supp;
		}
		
		return null;

	}

	@Override
	public void addProduct(String supplierId,AddProductDto addProductDto) {
		Product product = new Product();
		
		System.out.println(addProductDto);
		 
		product.setProductName(addProductDto.getProductName());
		
		product.setProductDescription(addProductDto.getProductDescription());
		
		product.setPrice(addProductDto.getPrice());
		
		product.setSupplierId((Integer.parseInt(supplierId)));
		
		product.setBrand(addProductDto.getBrand());
		
		product.setCategory(addProductDto.getCategory());
		
		productRepository.save(product);
	}
	
}
