package com.springboot.mydemo.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

import com.springboot.mydemo.dao.users.UserRepository;
import com.springboot.mydemo.model.users.Users;
import com.springboot.mydemo.requestdto.RegisterDto;
import com.springboot.mydemo.response.RestResponse;
import com.springboot.mydemo.response.StatusResponse;
import com.springboot.mydemo.util.AlreadyExistException;
import com.springboot.mydemo.util.HandleUserException;
import com.springboot.mydemo.validator.Validations;

@Service
public class UserServiceImpl implements UserService {
	private static final Logger logger = (Logger) LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	UserRepository userRepository;

	@Override
	public RestResponse userRegister(RegisterDto registerDto) throws Exception {

		RestResponse rs = null;
		// list of required parameter in this registration and can be change
		String[] requestedArray = { "userName", "userPassword", "firstName", "lastName", "contactNo", "emailId",
				"gender" };
		Validations validations = new Validations();
		// validate user with required fields
		rs = validations.validate(registerDto, requestedArray);

		if (rs != null) {
			StatusResponse ds = (StatusResponse) rs;
			logger.error("Signup validation Error " + ds.getMessage());
			return new StatusResponse(400, ds.getMessage(), null);
		}
		// validate email , must be unique
		Users u2 = this.findByEmail(registerDto.getEmailId());
		if (u2 != null) {
			throw new AlreadyExistException("User " + registerDto.getEmailId() + " already Exist");
		}

		// validate userName , must be unique
		u2 = this.findByUserName(registerDto.getUserName());
		if (u2 != null) {
			throw new AlreadyExistException("User " + registerDto.getUserName() + " already Exist");
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
		return new StatusResponse(202, "User Created Successfully !", u);
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

	// update the user record
	@Override
	public Users updateUser(RegisterDto userData) throws HandleUserException, Exception {
		Users updateRow = null;
		updateRow = userRepository.getById(userData.getId());
		System.out.println("Update Row ===" + updateRow);
		if (updateRow == null) {
			throw new HandleUserException("User  doesn't Exist");
		}
		updateRow = this.findByEmail(userData.getEmailId());
		if (updateRow != null) {
			throw new AlreadyExistException("User " + userData.getEmailId() + " already Exist");
		}

		// validate userName , must be unique
		updateRow = this.findByUserName(userData.getUserName());
		if (updateRow != null) {
			throw new AlreadyExistException("User " + userData.getUserName() + " already Exist");
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
	// @Override
	// public void deleteUser(DeleteDto deleteDto) {
	// System.out.println(deleteDto);
	// Users user = this.findByUserName(deleteDto.getUserName());
	// System.out.println(user);
	// if (user != null) {
	// this.deleteUser(user.getUserName());
	// System.out.println("A called ----");
	// }
	//
	// }

	// public Users findByUserName(String userName) {
	// try {
	// Users users = userRepository.findByUserNameIgnoreCase(userName);
	// return users;
	// } catch (Exception e) {
	// return null;
	// }
	// }

	// public void deleteUser(String userName) {
	// try {
	// userRepository.deleteUser(userName);
	// } catch (Exception e) {
	// System.out.println(e);
	// }
	// }

	// @Override
	// public Users getUser(DeleteDto deleteDto) {
	//
	// Users user =
	// userRepository.findByUserNameAndPassword(deleteDto.getUserName(),deleteDto.getPassword());
	// System.out.println(user);
	// if (user != null) {
	// return user;
	// }
	// return null;
	// }

}
