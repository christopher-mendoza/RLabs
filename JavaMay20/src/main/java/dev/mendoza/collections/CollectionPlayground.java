package dev.mendoza.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		User car = new User ("Car", "Iv", 23);
		
		users.add(u);
		users.add(car);
		users.add(u);
		
		System.out.println(users);
		
		/*
		 * Map - an object that 'maps' keys to values
		 * Key, Value pairs
		 * 
		 * A map cannot contain duplicate keys
		 * Each key maps to at most one value
		 * 
		 * HashMap - can contain one null value for a key
		 * HashMaps do not preserve order
		 * 
		 * Map<K,V> map = new HashMap<K,V>();
		 * TreeMap
		 * LinkedHashMap -> preserves order of insertion
		 */
		
		User u3 = new User("gamer", "mode", 20);
		User u4 = new User("callie", "lock", 21);
		User u5 = new User("el", "cast", 1000);
		
		Map<String, User> userMap = new HashMap<String, User>();
		userMap.put("admin", u);
		userMap.put("Car", car);
		userMap.put("gamer", u3);
		userMap.put("callie", u4);
		userMap.put("el", u5);
		System.out.println(userMap);
		
		// Map does not inherit from Iterable
		// .keySet()
		for(String key : userMap.keySet()) {
			System.out.println("Key: " + key + "\nValue: " + userMap.get(key));
		}
		// .entrySet()
		for(Map.Entry<String, User> entry : userMap.entrySet()) {
			String key = entry.getKey();
			User us = entry.getValue();
			System.out.println("Key: " + key + " Value: " + us);
		}
	}
}
