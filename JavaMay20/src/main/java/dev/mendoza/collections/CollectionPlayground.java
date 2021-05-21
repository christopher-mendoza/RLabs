package dev.mendoza.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionPlayground {

	public static void main(String[] args) {
		
		// Creating a List
		List<String> strList = new ArrayList<String>();
		
		/*
		 * Why List<> and ArrayList<>
		 * 
		 * Coding to interfaces - any implementation of List shares functionality (.add, .remove, etc)
		 * 
		 * All lists share these methods - they have their own implementations
		 */
		
		strList.add("Chris");
		strList.add("Bob");
		strList.add("Carrie");

		System.out.println(strList);
		
		List<User> users = new ArrayList<User>();
		
		User u = new User("admin", "password", 100);
		User car = new User ("Carrie", "Ivy", 23);
		
		users.add(u);
		users.add(car);
		users.add(u);
		
		System.out.println(users);
	}
}
