package com.ob.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out = resp.getWriter();
	out.println("<h1>Login Form</h1>");
	out.println("<form action = './home' method='post'>"
			+"<input type='text' name='username' placeholder = 'username'> <br>"
			+"<input type='text' name='password' > <br>"
			+"<input type='submit' name='submit' >"
			+"</form>");

	}
	
	
	
	

}
