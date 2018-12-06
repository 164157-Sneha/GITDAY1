package com.sneha.util;

import com.sneha.dao.UserDAOVer2;
import com.sneha.servlet.IUserDAO;
import com.sneha.servlet.UserDAO;

public class DAOUtility {

	public static IUserDAO getUserDAO()
	{
		return new UserDAOVer2();
	}
}
