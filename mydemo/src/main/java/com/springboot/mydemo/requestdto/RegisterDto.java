package com.springboot.mydemo.requestdto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.springboot.mydemo.model.enums.Enum.Gender;

public class RegisterDto {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public RegisterDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RegisterDto [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", firstName="
				+ firstName + ", lastName=" + lastName + ", contactNo=" + contactNo + ", emailId=" + emailId + "]";
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public RegisterDto(int id, String userName, String userPassword, String firstName, String lastName,
			String contactNo, String emailId, Gender gender) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.gender = gender;
	}

	private int id;

	@NotNull(message = "User Name required")
	@NotEmpty(message = "User Name required")
	private String userName;

	@NotNull(message = "Password required")
	@NotEmpty(message = "Password required")
	private String userPassword;

	@NotNull(message = "Enter first name")
	@NotEmpty(message = "Enter first name")
	private String firstName;

	@NotNull(message = "Enter last name")
	@NotEmpty(message = "Enter last name")
	private String lastName;

	@NotNull(message = "Contact phone required")
	@NotEmpty(message = "Contact phone required")
	private String contactNo;

	@Email(message = "Valid email id required")
	@NotNull(message = "Enter email Id")
	@NotEmpty(message = "Enter email Id")
	private String emailId;

	@Enumerated(EnumType.STRING)
	private Gender gender;

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
}
