package com.springboot.mydemo.requestdto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.springboot.mydemo.model.enums.Enum.Gender;

public class RegisterDto {
	@NotNull
	private int id;
	
	@Valid
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String userName;
	@NotNull
	private String password;
	@NotNull
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Override
	public String toString() {
		return "RegisterDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", password=" + password + ", gender=" + gender + "]";
	}
	public RegisterDto(int id, String firstName, String lastName, String userName, String password, Gender gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
}
