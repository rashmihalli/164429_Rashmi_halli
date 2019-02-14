package com.rashmi.dao;

import java.util.ArrayList;

import com.rashmi.pojo.user;

public class UserDAO implements IUserDAO{

	ArrayList<user> userList;

	public UserDAO() {
		userList = new ArrayList<>();
		userList.add(new user("rashmi", "java", "Admin"));
		userList.add(new user("rash", "jav", "User"));
		userList.add(new user("ras", "java", "Admin"));
	}

	public String getUserType(String userName, String password) {
		for (user user : userList) {
			if (user.getUserName().equals(userName)
					&& user.getPassword().equals(password)) {
				return user.getUserType();
			}
		}
		throw new InvalidUserException("user name and password doesn't exist...");
	}

	@Override
	public void addUser(user user) {
		
		
	}

	@Override
	public void changePassword(String userName, String oldPassword,
			String newPassword) {
		
		
	}

	@Override
	public void removeUser(String userName) {
		
		
	}

}
