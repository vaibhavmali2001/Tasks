package com.app.response;

public class LoginMessage {
	
	private String message;
	private boolean status;
	
	
	public LoginMessage() {
		super();
	}


	public LoginMessage(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "LoginMessage [message=" + message + ", status=" + status + "]";
	}
	
	
}
