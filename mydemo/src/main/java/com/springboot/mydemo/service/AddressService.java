package com.springboot.mydemo.service;

import com.springboot.mydemo.requestdto.AddressDto;

public interface AddressService {

	public void addAddress(AddressDto addressDto,long userId);

}
