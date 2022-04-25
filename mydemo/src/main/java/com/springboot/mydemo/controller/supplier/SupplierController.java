package com.springboot.mydemo.controller.supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mydemo.requestdto.SupplierRegisterDto;
import com.springboot.mydemo.service.SupplierService;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
	
	@Autowired
	SupplierService supplierService;

	@PostMapping("/registration")
	public void supplierRegistration(@RequestBody SupplierRegisterDto supplierRegisterDto)
	{
		this.supplierService.supplierRegistration(supplierRegisterDto);
	}
	
}
