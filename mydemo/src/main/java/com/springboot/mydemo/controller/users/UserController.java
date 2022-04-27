package com.springboot.mydemo.controller.users;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mydemo.requestdto.RegisterDto;
import com.springboot.mydemo.response.RestResponse;
import com.springboot.mydemo.response.StatusResponse;
import com.springboot.mydemo.service.UserService;
import com.springboot.mydemo.util.UserEmailAlreadyExistException;
import com.springboot.mydemo.util.UserNameAlreadyExistException;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/user")
public class UserController {
	private static final Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);
	@Autowired
	UserService userService;

	@PostMapping(value="/register", produces = "application/json")
	@Validated
	public RestResponse userRegister(@RequestBody RegisterDto registerDto){
		try {
//			this.userService.userRegister(registerDto);
			return new StatusResponse(200,"Success !",this.userService.userRegister(registerDto));
		}catch(UserEmailAlreadyExistException e){
			logger.error(e.getMessage());
			return new StatusResponse(409,"Email Already Exist. Not able to insert !",null);
		}catch(UserNameAlreadyExistException e) {
			logger.error(e.getMessage());
			return new StatusResponse(409,"User Name already exist ",null);		
			}catch (Exception e) {
				logger.error(e.getMessage());
				return new StatusResponse(500,"Error occurred, Server not responding. Please try after some time.", e);
			} 
		
		
	}
//	@PutMapping("/delete")
//	public void deleteUser(@RequestBody DeleteDto deleteDto )
//	{
//		System.out.println(deleteDto);
//		userService.deleteUser(deleteDto);
//	}
//	@GetMapping("/getUser")
//	public ResponseEntity<Users> getUser(@RequestBody DeleteDto deleteDto)
//	{
//		Users user = userService.getUser(deleteDto);
//		return ResponseEntity.ok(user);
//	}
	
	}
