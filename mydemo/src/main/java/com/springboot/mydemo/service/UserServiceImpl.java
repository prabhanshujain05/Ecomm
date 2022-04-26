package com.springboot.mydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mydemo.dao.users.UserRepository;
import com.springboot.mydemo.model.users.Users;
import com.springboot.mydemo.requestdto.RegisterDto;
import com.springboot.mydemo.util.UserEmailAlreadyExistException;
import com.springboot.mydemo.util.UserNameAlreadyExistException;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public Users userRegister(RegisterDto registerDto) throws UserEmailAlreadyExistException, UserNameAlreadyExistException , Exception{
		
		
		
		// validate email , must be unique
		Users u2  = this.findByEmail(registerDto.getEmailId());
				if(u2 != null) {
					throw new UserEmailAlreadyExistException("User "+registerDto.getEmailId()+" already Exist");
				}
				
				// validate userName , must be unique
				u2 = this.findByUserName(registerDto.getUserName());
				if(u2 != null) {
					throw new UserNameAlreadyExistException("User "+registerDto.getUserName()+" already Exist");
				}
				Users u = new Users();
	 
			u.setId(registerDto.getId());
			u.setFirstName(registerDto.getFirstName());
			u.setLastName(registerDto.getLastName());
			u.setUserName(registerDto.getUserName());
			u.setContactNo(registerDto.getContactNo());
			u.setEmailId(registerDto.getEmailId());
			u.setUserPassword(registerDto.getUserPassword());
			u.setGender(registerDto.getGender());
		
		
		userRepository.save(u);
		return u;
	}

	// to check if email is present or no	
	public Users findByEmail(String emailId) {
		try {

			Users users = userRepository.findByEmailIdIgnoreCase(emailId);

			return users;

		} catch (Exception e) {
			return null;
		}
	}
	
	public Users findByUserName(String username) {
		try {

			Users users = userRepository.findByUserNameIgnoreCase(username);

			return users;

		} catch (Exception e) {
			return null;
		}
	}
	
//	@Override
//	public void deleteUser(DeleteDto deleteDto) {
//		System.out.println(deleteDto);
//		Users user = this.findByUserName(deleteDto.getUserName());
//		System.out.println(user);
//		if (user != null) {
//			this.deleteUser(user.getUserName());
//			System.out.println("A called ----");
//		}
//
//	}

//	public Users findByUserName(String userName) {
//		try {
//			Users users = userRepository.findByUserNameIgnoreCase(userName);
//			return users;
//		} catch (Exception e) {
//			return null;
//		}
//	}

//	public void deleteUser(String userName) {
//		try {
//			userRepository.deleteUser(userName);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}

//	@Override
//	public Users getUser(DeleteDto deleteDto) {
//	
//		Users user = userRepository.findByUserNameAndPassword(deleteDto.getUserName(),deleteDto.getPassword());
//		System.out.println(user);
//		if (user != null) {
//			return user;
//		}		
//		return null;
//	}
}



