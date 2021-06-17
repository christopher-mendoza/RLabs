package dev.mendoza.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dev.mendoza.models.Cat;
import dev.mendoza.services.CatServiceImpl;

public class CatServlet extends HttpServlet {
	private CatServiceImpl cs = new CatServiceImpl();
	private Gson gson = new Gson();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String uri = request.getRequestURI();
		System.out.println(uri);
		
		/*
		 * For GET requests:
		 * 
		 * localhost:8080/CatAppServlet/cats -> get all cats
		 * 
		 * /cats/<id> -> get a cat by id
		 * 
		 */
		switch(uri) {
			case "CatAppServlet/cats": {
				System.out.println("Getting all cats...");
				List<Cat> cats = cs.getAllCats();
				System.out.println(cats);
				response.setHeader("Access-Control-Allow-Origin", "*");
				response.getWriter().append(gson.toJson(cats, Cat.class));
				break;
			}
			
			default: {
				System.out.println("Reached default case...");
				response.sendError(418, "Making tea");
				break;
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().append("Post request.");
	}
}
