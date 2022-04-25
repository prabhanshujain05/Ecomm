package com.springboot.mydemo.model.support;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class IbSupport {
	
	
	private long createdAt = System.currentTimeMillis();
	

	private long updatedAt = System.currentTimeMillis();
	

	private boolean isDeleted = false;
	

	private long deletedAt;
}
