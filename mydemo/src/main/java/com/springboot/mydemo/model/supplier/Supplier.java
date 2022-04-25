package com.springboot.mydemo.model.supplier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.springboot.mydemo.model.support.IbSupport;

@Entity
public class Supplier extends IbSupport{
	
	@Id
	@GeneratedValue(generator = "suplier_generator")
	@SequenceGenerator(
			name = "supplier_generator",
			sequenceName = "supplier_sequence",
			initialValue = 100000
			)
	private long id ;
	
	
	String name;
	
	String password;
	


	long contactNumber;
	
	String Address;
	
	String city;
	
	int postalCode ;
	
	String mailId;

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", password=" + password + ", contactNumber=" + contactNumber
				+ ", Address=" + Address + ", city=" + city + ", postalCode=" + postalCode + ", mailId=" + mailId + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Supplier(long id, String name, String password, long contactNumber, String address, String city,
			int postalCode, String mailId) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.contactNumber = contactNumber;
		Address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.mailId = mailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Supplier() {
		super();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public Supplier(long id, String name, long contactNumber, String address, String city, int postalCode,
			String mailId) {
		super();
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
		this.Address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.mailId = mailId;
	}
	


}
