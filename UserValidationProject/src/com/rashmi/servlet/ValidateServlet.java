package com.rashmi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rashmi.dao.IUserDAO;
import com.rashmi.dao.InvalidUserException;
import com.rashmi.util.DAOUtility;
 
@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String userType = "invalid";

		try {
			userType = getUserType(userName, password);
		} catch (InvalidUserException e) {
			out.print("<h1>Invalid User...</h1>");
		}

		RequestDispatcher requestDispatcher = null;

		if (userType.equals("Admin")) {
			requestDispatcher = request.getRequestDispatcher("/admin");
			
		} else if (userType.equals("User")) {
			requestDispatcher = request.getRequestDispatcher("/user");
			
		} else {
			requestDispatcher = request.getRequestDispatcher("/invalid");
			
		}
		requestDispatcher.forward(request, response);

	}


	private String getUserType(String userName, String password) {
		IUserDAO dao = DAOUtility.getUserDAO();
		return dao.getUserType(userName, password);

	}

}
