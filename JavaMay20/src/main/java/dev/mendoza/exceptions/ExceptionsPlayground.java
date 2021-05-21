package dev.mendoza.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsPlayground {
	public static void main(String[] args) {
		
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println(intArray[0]);
		System.out.println(intArray[6]);
		try {
			System.out.println(intArray[9]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("This will execute ALWAYS - WITH OR WITHOUT AN EXCEPTION");
		}
		
		try {
			FileInputStream f = new FileInputStream("../applications.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
