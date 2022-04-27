package com.springboot.mydemo.service;

import com.springboot.mydemo.model.users.Users;
import com.springboot.mydemo.requestdto.RegisterDto;
import com.springboot.mydemo.util.UserEmailAlreadyExistException;
import com.springboot.mydemo.util.UserNameAlreadyExistException;

public interface UserService {
	public Users userRegister(RegisterDto registerDto) throws UserEmailAlreadyExistException, UserNameAlreadyExistException, Exception;
	public void updateUser(RegisterDto updateDto);
	//	public void deleteUser(DeleteDto deleteDto);
//	public Users getUser(DeleteDto deleteDto);
}
