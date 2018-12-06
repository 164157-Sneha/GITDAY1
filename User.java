package com.sneha.pojo;

public class User {

	String userName;
	String password;
	String UserType;
	
	public User(String userName, String password, String userType) {
		super();
		this.userName = userName;
		this.password = password;
		UserType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return UserType;
	}

	public void setUserType(String userType) {
		UserType = userType;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password
				+ ", UserType=" + UserType + "]";
	}
	
	
	
}
