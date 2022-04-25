package com.springboot.mydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mydemo.dao.supplier.SupplierRepository;
import com.springboot.mydemo.model.supplier.Supplier;
import com.springboot.mydemo.requestdto.SupplierRegisterDto;

@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	SupplierRepository supplierRepository;

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

}
