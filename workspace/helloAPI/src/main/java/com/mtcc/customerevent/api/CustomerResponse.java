package com.mtcc.customerevent.api;

public class CustomerResponse {
	String message;
	String name = null;
	String email= null;
	String id = null;
	
	public CustomerResponse() {
		super();
//		this.message = message;
//		this.id = id;
	}
	public String getName() {
//		return message;
		return name;
	}
	public String getId() {
		//this.message = message;
		return id;
	}
	public String getEmail() {
		//this.message = message;
		return email;
	}
	public void setName(String name) {
//		return message;
		this.name = name;
	}
	public void setId(String id) {
		//this.message = message;
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}