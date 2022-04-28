package com.springboot.mydemo.service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mydemo.controller.users.UserController;
import com.springboot.mydemo.dao.address.AddressRepository;
import com.springboot.mydemo.dao.users.UserRepository;
import com.springboot.mydemo.model.address.Address;
import com.springboot.mydemo.model.users.Users;
import com.springboot.mydemo.requestdto.AddressDto;

import ch.qos.logback.classic.Logger;
@Service
public class AddressServiceImpl implements AddressService {
	private static final Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void addAddress(AddressDto addressDto,long id) {
		logger.info(" "+addressDto);
		
		
		
		Users user = userRepository.findById(id);
		if(user==null)
		{
			return;
		}
		
		Address address = new Address();
		address.setAddress1(addressDto.getAddress1());
		address.setAddress2(addressDto.getAddress2());
		address.setAddressType(addressDto.getAddressType());
		address.setContactNo(addressDto.getContactNo());
		address.setDistrict(addressDto.getDistrict());
		address.setPostalCode(addressDto.getPostalCode());
		
		List<Address> list = user.getAddress();
		logger.info(" "+list);
		list.add(addressRepository.save(address));
		user.setAddress(list);
		
		userRepository.save(user);
	
		
		
		
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
