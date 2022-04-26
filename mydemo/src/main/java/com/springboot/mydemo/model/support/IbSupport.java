package com.springboot.mydemo.model.support;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class IbSupport {
	
	
	private long createdAt = System.currentTimeMillis();
	

	private long updatedAt = System.currentTimeMillis();
	

	private boolean isDeleted = false;
	

	private long deletedAt;


	public long getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}


	public long getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(long updatedAt) {
		this.updatedAt = updatedAt;
	}


	public boolean isDeleted() {
		return isDeleted;
	}


	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}


	public long getDeletedAt() {
		return deletedAt;
	}


	public void setDeletedAt(long deletedAt) {
		this.deletedAt = deletedAt;
	}


	@Override
	public String toString() {
		return "IbSupport [createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", isDeleted=" + isDeleted
				+ ", deletedAt=" + deletedAt + "]";
	}
	
	
}
