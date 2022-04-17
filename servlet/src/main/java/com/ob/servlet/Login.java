package com.ob.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
PrintWriter out = res.getWriter();
out.println("<h1>Login</h1>");
out.println("<form action = './home'>"
		+"<input type='text' name='username' placeholder = 'username'> <br>"
		+"<input type='text' name='password' > <br>"
		+"<input type='submit' name='submit' >"
		+"</form>");
	}
	

}
