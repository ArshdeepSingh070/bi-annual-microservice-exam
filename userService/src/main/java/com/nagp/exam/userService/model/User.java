package com.nagp.exam.userService.model;

public class User {

	private String id;
	private String type;
	
	public User() {
		
	}
	public User(String id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
