package com.springboot.mydemo.controller.users;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.mydemo.requestdto.RegisterDto;
import com.springboot.mydemo.response.RestResponse;
import com.springboot.mydemo.response.StatusResponse;
import com.springboot.mydemo.service.UserService;
import com.springboot.mydemo.util.AlreadyExistException;
import com.springboot.mydemo.util.HandleUserException;


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

			return new StatusResponse(200,"Success !",this.userService.userRegister(registerDto));
		}catch(AlreadyExistException e){
				logger.error(e.getMessage());
				return new StatusResponse(409,e.getMessage(),null);
			}catch(Exception e){
				logger.error(e.getMessage());
				return new StatusResponse(500,"Server Error, Please try after some time to update !",null);
			}
		
		
	}
	
	@PutMapping(value = "/updatedata", produces = "application/json")
	public RestResponse updateUser(@RequestBody RegisterDto updateData){
			try{
				return new StatusResponse(200,"Success !",this.userService.updateUser(updateData));
			}catch(HandleUserException e){
				logger.error(e.getMessage());
				return new StatusResponse(404,e.getMessage(),null);
			}catch(AlreadyExistException e){
				logger.error(e.getMessage());
				return new StatusResponse(409,e.getMessage(),null);
			}catch(Exception e){
				logger.error(e.getMessage());
				return new StatusResponse(500,"Server Error, Please try after some time to update !",null);
			}
		
	}
	
	
//	@GetMapping("/getUser")
//	public ResponseEntity<Users> getUser(@RequestBody DeleteDto deleteDto)
//	{
//		Users user = userService.getUser(deleteDto);
//		return ResponseEntity.ok(user);
//	}
	
	}
