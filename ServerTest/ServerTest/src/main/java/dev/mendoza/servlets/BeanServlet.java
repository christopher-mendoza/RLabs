package dev.mendoza.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dev.mendoza.beans.Bean;

public class BeanServlet extends HttpServlet {
	
	public Gson gson = new Gson();
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Bean bean = new Bean();
		
		response.getWriter().append(gson.toJson(bean, Bean.class));
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Bean b = gson.fromJson(request.getReader(), Bean.class);
		System.out.println(b);
		response.getWriter().append(gson.toJson(b));
	}
}
