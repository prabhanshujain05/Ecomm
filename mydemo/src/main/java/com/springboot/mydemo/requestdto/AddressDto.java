package com.springboot.mydemo.requestdto;
import com.springboot.mydemo.model.enums.Enum.AddressType;
import com.springboot.mydemo.model.support.IbSupport;

public class AddressDto extends IbSupport{

	
	private long userId;

	private AddressType addressType;

	private String address1;

	private String address2;

	private String district;

	private int postalCode;

	private String contactNo;
	
	@Override
	public String toString() {
		return "AddressDto [userId=" + userId + ", addressType=" + addressType + ", address1=" + address1
				+ ", address2=" + address2 + ", district=" + district + ", postalCode=" + postalCode + ", contactNo="
				+ contactNo + "]";
	}

	public AddressDto() {
		super();
		// TODO Auto-generated constructor stub
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
