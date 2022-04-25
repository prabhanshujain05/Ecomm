package com.springboot.mydemo.controller.users;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mydemo.model.users.Users;
import com.springboot.mydemo.requestdto.DeleteDto;
import com.springboot.mydemo.requestdto.RegisterDto;
import com.springboot.mydemo.service.UserService;

@RestController

@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/register")
	@Validated
	public void userRegister(@RequestBody @Valid RegisterDto registerDto){
		System.out.print(registerDto);
		this.userService.userRegister(registerDto);
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
