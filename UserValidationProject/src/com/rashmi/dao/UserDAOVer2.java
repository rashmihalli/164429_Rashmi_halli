package com.rashmi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rashmi.pojo.user;

public class UserDAOVer2 implements IUserDAO {

	@Override
	public String getUserType(String userName, String password) {
		Connection connection = ConnectionFactory.getConnection();
		try{
			
			PreparedStatement statement = connection
					.prepareStatement("select * from user_table where userName =? and password=?");
			statement.setString(1, userName);
			statement.setString(2, password);
			ResultSet set = statement.executeQuery();
			
			while(set.next()){
				if(set.getString("userName").equals(userName) && set.getString("password").equals(password)){
					
					return set.getString("userType");
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return "canPutAnything";
				
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
	public static void main(String[] args) {
		System.out.println(new UserDAOVer2().getUserType("rashmi", "java"));
	}

}
