package com.springboot.mydemo.model.users;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.springboot.mydemo.model.address.Address;
import com.springboot.mydemo.model.enums.Enum.Gender;
import com.springboot.mydemo.model.support.IbSupport;

@Entity
public class Users extends IbSupport {

	@Id
	@GeneratedValue(generator = "user_generator")
	@SequenceGenerator(
			name = "user_generator",
			sequenceName = "user_sequence",
			initialValue = 100000
			)
	private long id;
	
	private String userName;
	
	private String userPassword;
	
	private String firstName;
	
	private String lastName;
	
	private String contactNo;
	
	private String emailId;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;

	
	@OneToMany
	@JoinColumn(name ="fk_user_id")
	private List<Address> address;


	@Override
	public String toString() {
		return "Users [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", firstName="
				+ firstName + ", lastName=" + lastName + ", contactNo=" + contactNo + ", emailId=" + emailId
				+ ", gender=" + gender + ", address=" + address + "]";
	}


	public Users(long createdAt, long updatedAt, boolean isDeleted, long deletedAt, int id, String userName,
			String userPassword, String firstName, String lastName, String contactNo, String emailId, Gender gender,
			List<Address> address) {
		super(createdAt, updatedAt, isDeleted, deletedAt);
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.gender = gender;
		this.address = address;
	}


	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Users(long createdAt, long updatedAt, boolean isDeleted, long deletedAt) {
		super(createdAt, updatedAt, isDeleted, deletedAt);
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
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


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}

	
}
