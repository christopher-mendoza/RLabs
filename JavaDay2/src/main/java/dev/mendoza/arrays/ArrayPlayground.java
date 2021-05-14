package dev.mendoza.arrays;

/*
 * Arrays are collections of multiple values of the same type
 * 
 * Arrays have a fixed length, that is determined at creation
 * 
 * Arrays can be pre-populated
 * 
 * Arrays are accessed through indices (index goes from 0 -> length - 1)
 * 
 */
public class ArrayPlayground {
	public static void main(String[] args) {
		// Array Declaration
		int[] intArray = new int[10];
		
		// Array Literal (pre-populated)
		int[] otherArray = {1, 2, 3, 4, 5}; // length of 5
		
		System.out.println("intArray length: " + intArray.length);
		System.out.println("otherArray length: " + otherArray.length);
		
		System.out.println("intArray index at 0: " + intArray[0]);
		
		int[][] multiArray = new int[2][3];
		
		String[] strArray = {"Chris", "is", "awesome"};
		System.out.println(strArray[0]);
		
		/*
		 * For Loops
		 */
		for(int index = 0; index < otherArray.length; index++) {
			System.out.println("Index: " + index + "\nValue at Index: " + otherArray[index]);
			
		}
		
		for(int num : otherArray) {
			System.out.println(num);
		}
	}

}
