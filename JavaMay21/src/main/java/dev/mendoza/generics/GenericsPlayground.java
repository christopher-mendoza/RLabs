package dev.mendoza.generics;

import java.util.List;
import java.util.ArrayList;

public class GenericsPlayground {
	public static void main(String[] args) {
		
		// Generics were added in Java 5
		List myList = new ArrayList();
		
		List<String> strList = new ArrayList<String>();
		strList.add("abc");
		strList.add("def");
		
		for(String str : strList) {
			System.out.println(str);
		}
		
		// The data type that we pass to this class will determine
		// the data type of its members
		
		GenericClass<String> myGenericClass = new GenericClass<String>();
		myGenericClass.setValue("some value");
		System.out.println(myGenericClass.getValue());
		
		GenericClass<Integer> myGenClass = new GenericClass<Integer>();
		myGenClass.setValue(100);
		myGenClass.getValue();
		System.out.println(myGenClass.getValue());
	}
}
