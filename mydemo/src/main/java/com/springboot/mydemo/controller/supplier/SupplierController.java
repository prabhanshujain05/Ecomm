package com.springboot.mydemo.controller.supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.mydemo.model.supplier.Supplier;
import com.springboot.mydemo.requestdto.AddProductDto;
import com.springboot.mydemo.requestdto.SupplierLoginDto;
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
	
	@GetMapping("/login")
	public ResponseEntity<Supplier> suppplierLogin(@RequestBody SupplierLoginDto supplierLoginDto)
	{
		Supplier supp = supplierService.supplierLogin(supplierLoginDto);
		return ResponseEntity.ok(supp);
	}
	
	@PostMapping("/addproduct/{supplierId}")
	public void addProduct(@PathVariable String supplierId, @RequestBody AddProductDto addProductDto)
	{
		this.supplierService.addProduct(supplierId,addProductDto);
	}
	
	@PutMapping("/updateproduct/{id}")
	public void updateProduct(@PathVariable String id,@RequestBody AddProductDto addProductDto)
	{
		supplierService.updateProduct(Integer.parseInt(id),addProductDto);
	}
	
	
}
