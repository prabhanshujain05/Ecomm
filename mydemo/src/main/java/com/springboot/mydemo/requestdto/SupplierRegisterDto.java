package com.springboot.mydemo.requestdto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class SupplierRegisterDto {
	
	@NotNull
	private int id; 
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String password;
	
	@NotNull
	private long contactNumber;
	
	@NotBlank
	private String address;
	
	@NotBlank
	private String city;
	
	@NotNull
	private int postaCode;
	
	@NotBlank
	private String mailId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostaCode() {
		return postaCode;
	}

	public void setPostaCode(int postaCode) {
		this.postaCode = postaCode;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	@Override
	public String toString() {
		return "SupplierRegisterDto [id=" + id + ", name=" + name + ", password=" + password + ", contactNumber="
				+ contactNumber + ", address=" + address + ", city=" + city + ", postaCode=" + postaCode + ", mailId="
				+ mailId + "]";
	}

	public SupplierRegisterDto(@NotNull int id, @NotBlank String name, @NotBlank String password,
			@NotNull long contactNumber, @NotBlank String address, @NotBlank String city, @NotNull int postaCode,
			@NotBlank String mailId) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.contactNumber = contactNumber;
		this.address = address;
		this.city = city;
		this.postaCode = postaCode;
		this.mailId = mailId;
	}

	public SupplierRegisterDto() {
		super();
	}
	
}
