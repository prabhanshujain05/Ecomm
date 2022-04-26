package com.springboot.mydemo.model.address;



import javax.persistence.Entity;

import javax.persistence.EnumType;

import javax.persistence.Enumerated;

import javax.persistence.GeneratedValue;

import javax.persistence.Id;

import javax.persistence.SequenceGenerator;



import com.springboot.mydemo.model.enums.Enum.AddressType;

import com.springboot.mydemo.model.support.IbSupport;



@Entity

public class Address extends IbSupport{



	@Id

	@GeneratedValue(generator = "address_generator")

	@SequenceGenerator(

			name = "address_generator",

			sequenceName = "address_sequence",

			initialValue = 100000

			)

	private long id;

	

	private long userId;

	

	@Enumerated(EnumType.STRING)

	private AddressType addressType;

	

	private String address1;

	

	private String address2;

	

	private String district;

	

	private int postalCode;

	

	private String contactNo;

	

	@Override

	public String toString() {

		return "Address [id=" + id + ", userId=" + userId + ", addressType=" + addressType + ", address1=" + address1

				+ ", address2=" + address2 + ", district=" + district + ", postalCode=" + postalCode + ", contactNo="

				+ contactNo + "]";

	}



	public Address() {

		super();

		// TODO Auto-generated constructor stub

	}



	public Address(long id, long userId, AddressType addressType, String address1, String address2, String district,

			int postalCode, String contactNo) {

		super();

		this.id = id;

		this.userId = userId;

		this.addressType = addressType;

		this.address1 = address1;

		this.address2 = address2;

		this.district = district;

		this.postalCode = postalCode;

		this.contactNo = contactNo;

	}



	public long getId() {

		return id;

	}



	public void setId(long id) {

		this.id = id;

	}



	public long getUserId() {

		return userId;

	}



	public void setUserId(long userId) {

		this.userId = userId;

	}



	public AddressType getAddressType() {

		return addressType;

	}



	public void setAddressType(AddressType addressType) {

		this.addressType = addressType;

	}

	public String getAddress1() {

		return address1;

	}


	public void setAddress1(String address1) {

		this.address1 = address1;

	}

	public String getAddress2() {

		return address2;

	}


	public void setAddress2(String address2) {

		this.address2 = address2;

	}


	public String getDistrict() {

		return district;

	}


	public void setDistrict(String district) {

		this.district = district;

	}


	public int getPostalCode() {

		return postalCode;

	}


	public void setPostalCode(int postalCode) {

		this.postalCode = postalCode;

	}

	public String getContactNo() {

		return contactNo;

	}



	public void setContactNo(String contactNo) {

		this.contactNo = contactNo;

	}

}