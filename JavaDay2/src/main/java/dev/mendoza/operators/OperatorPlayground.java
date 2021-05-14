package dev.mendoza.operators;

public class OperatorPlayground {
	
	public static void main(String[] args) {
		int x = 3;
		int y = 2;
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("Addition: " + (x + y));
		System.out.println("Subtraction: " + (x - y));
		System.out.println("Multiplication: " + (x * y));
		System.out.println("Division: " + ((double)x / (double)y));
		
		// Determine if a number is even
		System.out.println("Modulus: " + (x % y));
		
		// Control flow statements
		// Ways to affect the flow of our applications' logic
		if(x % 2 == 0) {
			System.out.println(x + " is an even number!");
		}
		else {
			System.out.println(x + " is not an even number!");
		}
	}

}
