package com.springboot.mydemo.service;

import com.springboot.mydemo.model.users.Users;
import com.springboot.mydemo.requestdto.RegisterDto;
import com.springboot.mydemo.response.RestResponse;
import com.springboot.mydemo.util.HandleUserException;

public interface UserService {
	public RestResponse userRegister(RegisterDto registerDto) throws HandleUserException, Exception;

	public Users updateUser(RegisterDto updateDto) throws HandleUserException, Exception;
	// public void deleteUser(DeleteDto deleteDto);
	// public Users getUser(DeleteDto deleteDto);
}
