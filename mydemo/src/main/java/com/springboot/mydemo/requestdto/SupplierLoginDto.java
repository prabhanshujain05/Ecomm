package com.springboot.mydemo.requestdto;

import javax.validation.constraints.NotBlank;

public class SupplierLoginDto {
	
	@NotBlank
	private String mailId;
	
	@NotBlank 
	private String password;

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "SuppplierLoginDto [mailId=" + mailId + ", password=" + password + "]";
	}

	public SupplierLoginDto(@NotBlank String mailId, @NotBlank String password) {
		super();
		this.mailId = mailId;
		this.password = password;
	}

	public SupplierLoginDto() {
		super();
	}
	
	

}
