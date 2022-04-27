package com.springboot.mydemo.controller.address;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mydemo.requestdto.AddressDto;
import com.springboot.mydemo.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	@PostMapping("/add/{userId}")
	public void addAddress(@RequestBody AddressDto addressDto,@PathVariable String userId)
	{
		this.addressService.addAddress(addressDto,Long.parseLong(userId));
	}
		
	@PutMapping("/delete/{id}")
	public void deleteAddress(@PathVariable String id)
	{
		this.addressService.deleteAddress(Long.parseLong(id));
	}
	
	@PutMapping("/update/{id}")
	public void updateAddress(@RequestBody AddressDto addressDto, @PathVariable String id)
	{
		this.addressService.updateAddress(addressDto,Long.parseLong(id));
	}
}
