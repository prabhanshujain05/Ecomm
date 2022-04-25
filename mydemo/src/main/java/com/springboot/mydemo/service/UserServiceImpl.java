package com.springboot.mydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mydemo.dao.users.UserRepository;
import com.springboot.mydemo.model.users.Users;
import com.springboot.mydemo.requestdto.DeleteDto;
import com.springboot.mydemo.requestdto.RegisterDto;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public void userRegister(RegisterDto registerDto) {
		Users u = new Users();
		u.setId(registerDto.getId());
		u.setFirstName(registerDto.getFirstName());
		u.setLastName(registerDto.getLastName());
		u.setUserName(registerDto.getUserName());
		u.setPassword(registerDto.getPassword());
		u.setGender(registerDto.getGender());
		userRepository.save(u);
	}

	@Override
	public void deleteUser(DeleteDto deleteDto) {
		System.out.println(deleteDto);
		Users user = this.findByUserName(deleteDto.getUserName());
		System.out.println(user);
		if (user != null) {
			this.deleteUser(user.getUserName());
			System.out.println("A called ----");
		}

	}

	public Users findByUserName(String userName) {
		try {
			Users users = userRepository.findByUserNameIgnoreCase(userName);
			return users;
		} catch (Exception e) {
			return null;
		}
	}

	public void deleteUser(String userName) {
		try {
			userRepository.deleteUser(userName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public Users getUser(DeleteDto deleteDto) {
	
		Users user = userRepository.findByUserNameAndPassword(deleteDto.getUserName(),deleteDto.getPassword());
		System.out.println(user);
		if (user != null) {
			return user;
		}		
		return null;
	}
}



