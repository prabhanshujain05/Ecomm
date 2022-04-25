package com.springboot.mydemo.service;

import org.springframework.http.ResponseEntity;

import com.springboot.mydemo.model.users.Users;
import com.springboot.mydemo.requestdto.DeleteDto;
import com.springboot.mydemo.requestdto.RegisterDto;

public interface UserService {
	public void userRegister(RegisterDto registerDto);
//	public void deleteUser(DeleteDto deleteDto);
//	public Users getUser(DeleteDto deleteDto);
}
