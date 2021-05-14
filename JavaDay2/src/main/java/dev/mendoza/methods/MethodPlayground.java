package dev.mendoza.methods;

public class MethodPlayground {

	/*
	 * Anatomy of a method
	 * 
	 * Access Modifier + Non-Access Modifier(optional) + Return Type + methodName(Parameters) { method body }
	 * 
	 * Access Modifier - Used to define how accessible the given method is
	 * 
	 * Non-Access Modifier - Special keyword that can add or limit functionality to the given method
	 * 
	 * Return Type - What type of data the method must return
	 * Every method must have a return type (if it doesn't return anything, use void)
	 * 
	 * Name - The name we use to call that method
	 * 
	 * Parameters - Optional, list of placeholder variables that will be passed into the method when it is called
	 */
	
	public static void main(String[] args) {
		myMethod();
		add(1, 2);
	}
	
	public static void myMethod() {
		System.out.println("Hello from inside my method!");
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
}
