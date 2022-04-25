package com.springboot.mydemo.requestdto;

import org.springframework.lang.NonNull;

public class DeleteDto {
	@NonNull
	private String userName;
	@NonNull
	private String password;
	public DeleteDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	@Override
	public String toString() {
		return "DeleteDto [userName=" + userName + ", password=" + password + "]";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public DeleteDto(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
}
