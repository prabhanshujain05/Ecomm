package com.springboot.mydemo.service;

import com.springboot.mydemo.requestdto.AddressDto;

public interface AddressService {

	public void addAddress(AddressDto addressDto, long id);

	public void deleteAddress(long id);

	public void updateAddress(AddressDto addressDto, long id);

}
