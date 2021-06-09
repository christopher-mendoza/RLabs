package dev.mendoza.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FrontControllerServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().append("Welcome to the Front Controller");
		String uri = request.getRequestURI();
		System.out.println(uri);
		response.getWriter().append("\n" + uri);
		
		// Sessions
		HttpSession session = request.getSession();
		System.out.println(session.getId());
		session.setAttribute("loggedInUser", "{'firstName':'Chris', 'lastName':'Mendoza'}");
		System.out.println(session.getAttribute("loggedInUser"));
		session.setMaxInactiveInterval(0);
		session.invalidate();
		
		
		switch(uri) {
			case "/ServerTest/test": {
				response.getWriter().append("\nTest Worked!");
				response.getWriter().append("\n" + session.getAttribute("loggedInUser"));
				break;
			}
			case "/ServerTest/googleredirect": {
				response.sendRedirect("https://www.google.com");
				break;
			}
			case "/ServerTest/beans": {
				response.sendRedirect("/ServerTest/bean");
				break;
			}
			default: {
				response.sendError(418, "Sorry teapot here.");
				break;
			}
		}
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doGet(request, response);
	}
}
