package com.springboot.mydemo.response;

public class StatusResponse implements RestResponse{
	
	protected int status;
	protected String message;
	private Object data;
	
	public StatusResponse(int status,String message,Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public StatusResponse() {
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) 
	{
		this.message = message;
	}

	@Override
	public String toString() {
		return "StatusResponse [status=" + status + ", message=" + message + "]";
	}
	
}
