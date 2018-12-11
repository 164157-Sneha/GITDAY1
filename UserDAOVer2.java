package com.sneha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sneha.pojo.User;
import com.sneha.servlet.IUserDAO;

public class UserDAOVer2 implements IUserDAO{

	@Override
	public String getUserType(String userName, String password) {
		Connection connection=ConnectionFactory.getConnection();
		
		try {
			
			PreparedStatement statement = connection.prepareStatement("select * from UserTable where Username=? and Password=?");
			statement.setString(1, userName);
			statement.setString(2, password);
			ResultSet set = statement.executeQuery();
			while(set.next()){
				if(set.getString("Username").equals(userName) && set.getString("Password").equals(password)){
					return set.getString("UserType");
			}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		statement.setString(1, userName);
//		statement.setString(2, password);
		
		return null;
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

	public static void main(String[] args) {
		
		System.out.println(new UserDAOVer2().getUserType("Sneha","assa"));
	}
}
