package com.rashmi.dao;

import com.rashmi.pojo.user;

public interface IUserDAO {
	
	public String getUserType(String userName, String password);
	public void addUser(user user);
	public void changePassword(String userName, String oldPassword, String newPassword);
	public void removeUser(String userName);

}
