package dev.mendoza.strings;

public class StringPlayground {

	// Strings are Objects in Java
	// Strings are immutable
	// There are two ways to create a string
	public static void main(String[] args) {
		// String literal
		String s1 = "Hello";
		
		String s2 = new String(" World");
		
//		System.out.println(s1);
//		System.out.println(s2);
		
		// charAt()
		System.out.println(s1.charAt(0));
		
		// indexOf()
		System.out.println(s1.indexOf('e'));
		
		// length()
		System.out.println(s1.length());
		
		// substring()
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(0, 3)); // Not inclusive
		
		// equals()
		System.out.println("s1.equals(s2) = " + s1.equals(s2));
		// NOTE: with Strings == is not the same as equals()
		System.out.println("s1 == s2 = " + (s1 == s2));
		String s3 = "Hello";
		System.out.println("s1 == s3 = " + (s1 == s3));
	
		// StringBuilder - used to work with Strings
		// Makes them mutable
		StringBuilder sb = new StringBuilder("My name is Chris.");
		sb.append(" Nice to meet you.");
		System.out.println(sb);
		
		String sub = sb.substring(10);
		System.out.println(sub);
		
		int index = sb.indexOf("N");
		System.out.println(index);
		
		sb.replace(0,  sb.indexOf("N"), "");
		System.out.println(sb);
		
		// StringBuffer - thread safe version of the StringBuilder
	}
	
}
