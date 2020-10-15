package com.ofss;

public class Customer {
	private String userName;
	private String location;
	public Customer(String userName, String location) {
		super();
		this.userName = userName;
		this.location = location;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Customer [userName=" + userName + ", location=" + location + "]";
	}
	
	
}	
