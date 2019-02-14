package com.rashmi.util;

import com.rashmi.dao.IUserDAO;
import com.rashmi.dao.UserDAOVer2;

public class DAOUtility {
	
	public static IUserDAO getUserDAO(){
		return new UserDAOVer2();
	}

}
