package com.ob.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Home extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
PrintWriter out = res.getWriter();
String username = req.getParameter("username");
out.println("<h2>welcome </h2>"+ username);
	}
	

}
