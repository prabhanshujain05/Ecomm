package com.springboot.mydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mydemo.dao.address.AddressRepository;
import com.springboot.mydemo.model.address.Address;
import com.springboot.mydemo.requestdto.AddressDto;
@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressRepository addressRepository;
	@Override
	public void addAddress(AddressDto addressDto,long userId) {
		System.out.println(addressDto);
		Address address = new Address();
		address.setUserId(userId);
		
		address.setAddress1(addressDto.getAddress1());
		address.setAddress2(addressDto.getAddress2());
		address.setAddressType(addressDto.getAddressType());
		address.setContactNo(addressDto.getContactNo());
		address.setDistrict(addressDto.getDistrict());
		address.setPostalCode(addressDto.getPostalCode());
		addressRepository.save(address);
	}
	@Override
	public void deleteAddress(long id) {
		Address address = addressRepository.findById(id);
		if(address!=null)
		{
			address.setDeleted(true);
			addressRepository.save(address);
		}
		
	}
	@Override
	public void updateAddress(AddressDto addressDto, long id) {
		Address address = addressRepository.findById(id);
		if(address!=null)
		{
			address.setUserId(addressDto.getUserId());
			address.setAddress1(addressDto.getAddress1());
			address.setAddress2(addressDto.getAddress2());
			address.setAddressType(addressDto.getAddressType());
			address.setContactNo(addressDto.getContactNo());
			address.setDistrict(addressDto.getDistrict());
			address.setPostalCode(addressDto.getPostalCode());
			address.setUpdatedAt(System.currentTimeMillis());
			addressRepository.save(address);
		}
		
	}	

}
