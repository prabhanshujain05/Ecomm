package com.springboot.mydemo.requestdto;

import com.springboot.mydemo.model.enums.Enum.AddressType;

public class AddressUpdateDto {
	private long userId;

	private AddressType addressType;

	private String address1;

	private String address2;

	private String district;

	private int postalCode;

	private String contactNo;


}
