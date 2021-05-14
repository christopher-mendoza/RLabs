package dev.mendoza.controlflow;

public class SwitchStatements {
	public static void main(String[] args) {
		/*
		 * Switch statements check some variable against multiple,
		 * defined values and executes code if the value of the 
		 * variable matches
		 */
		
		int x = 4;
		switch(x) {
			case 1: {
				System.out.println("Case 1 is true");
				break;
			}
			case 2: {
				System.out.println("Case 2 is true");
				break;
			}
			case 3: {
				System.out.println("Case 3 is true");
				break;
			}
			default: {
				System.out.println("Reached the default case");
			}
		
		}
	}

}
