package com.sneha.servlet;

import java.util.ArrayList;

import com.sneha.pojo.User;

public class UserDAO implements IUserDAO {

	ArrayList<User> userList;
	
	public UserDAO(){
		userList= new ArrayList<>();
		userList.add(new User("Sneha","java","Admin"));
		userList.add(new User("Yuvraj","sql","User"));
		userList.add(new User("Rahul","java","Admin"));
	}
		public String getUserType(String userName,String password){
			
		for(User user:userList){
			if(user.getUserName().equals(userName) && user.getPassword().equals(password))
			{
				return user.getUserType();
			}
		}
		throw new InvalidUserException("User is Invalid.....");
		//return "invalid";
	}
		@Override
		public void addUser(User user) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void changePassword(String userName, String oldPassword,
				String newPassword) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void removeUser(String userName) {
			// TODO Auto-generated method stub
			
		}
}
