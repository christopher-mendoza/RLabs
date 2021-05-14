package dev.mendoza.controlflow;

public class IfElse {

	public static void main(String[] args) {
		int x = 70;
		if (x > 50 && x < 100) {
			System.out.println(x + " is between 50 and 100");
			if(x > 60 && x < 90) {
				System.out.println(x + " is between 60 and 90");
			}
		}
		else if(x > 100) {
			System.out.println(x + " is greater than 100");
		}
		else {
			System.out.println("The if statement is false");
		}
		
		/*
		 * Ternary Operations
		 * 
		 * syntax:
		 * 	boolean condition ? value if true : value if false;
		 */
		String result = (x > 5) ? "Yes" : "No";
		System.out.println(result);

	}

}
