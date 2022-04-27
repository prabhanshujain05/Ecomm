package com.springboot.mydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mydemo.dao.users.UserRepository;
import com.springboot.mydemo.model.users.Users;
import com.springboot.mydemo.requestdto.RegisterDto;
import com.springboot.mydemo.util.AlreadyExistException;
import com.springboot.mydemo.util.HandleUserException;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public Users userRegister(RegisterDto registerDto) throws   Exception{
		
		
		
		// validate email , must be unique
		Users u2  = this.findByEmail(registerDto.getEmailId());
				if(u2 != null) {
					throw new AlreadyExistException("User "+registerDto.getEmailId()+" already Exist");
				}
				
				// validate userName , must be unique
				u2 = this.findByUserName(registerDto.getUserName());
				if(u2 != null) {
					throw new AlreadyExistException("User "+registerDto.getUserName()+" already Exist");
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

	
	
	//update the user record
	@Override
	public Users updateUser(RegisterDto userData) throws HandleUserException, Exception{
		Users updateRow = null;
		updateRow = userRepository.getById(userData.getId());
		System.out.println("Update Row ==="+updateRow);
		if(updateRow==null){
			throw new HandleUserException("User  doesn't Exist");
		}
		 updateRow = this.findByEmail(userData.getEmailId());
				if(updateRow != null) {
					throw new AlreadyExistException("User "+userData.getEmailId()+" already Exist");
				}
				
				// validate userName , must be unique
				updateRow = this.findByUserName(userData.getUserName());
				if(updateRow != null) {
					throw new AlreadyExistException("User "+userData.getUserName()+" already Exist");
				}
			 updateRow = new Users();
	 
			updateRow.setFirstName(userData.getFirstName());
			updateRow.setLastName(userData.getLastName());
			updateRow.setUserName(userData.getUserName());
			updateRow.setContactNo(userData.getContactNo());
			updateRow.setEmailId(userData.getEmailId());
			updateRow.setUserPassword(userData.getUserPassword());
			updateRow.setGender(userData.getGender()); 

			userRepository.save(updateRow);
			return updateRow;
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



