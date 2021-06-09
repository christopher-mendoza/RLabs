package dev.mendoza.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		PrintWriter pw = response.getWriter();
//		pw.write("<h1>Hello Again</h1>");
		
		response.getWriter().write("<h1>This is another way to do it</h1>");
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		response.getWriter().write("Hello, " + firstName + " " + lastName);
	}
}
