package dev.mendoza.wrappers;

import java.util.List;
import java.util.ArrayList;

public class WrapperPlayground {
	public static void main(String[] args) {
		int i = 100;
		
		// Wrapper Classes are ways to work with primitives by making them objects
		
		Integer i2 = i; // Autoboxing - Java behind the scenes automatically 'wraps' our primitive in an Object
		Double d = 3.54;
		Float f = 5.00f;
		Boolean b = false;
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(i);
	}
}
