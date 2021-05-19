package dev.mendoza.interfaces;

// Interfaces are implicitly abstract
public interface Swimmable {
	
	// Interface has no constructor
	// Interfaces cannot be instantiated, can only be implemented or extended
	// All fields declared within an interface are implicitly; public static and final
	
	// Static - keyword means the variable that it is modifying is a class variable
	//			Across all instances of that class, they share the same 'static' variable
	//			with methods - this means we do not need an instance of the class in order to call its methods
	//			** No longer associated with the instance, it is associated with the class **
	// Final - keyword means the variable or method cannot be changed once instantiated
	int MY_INT = 35;

	// Abstract method - because this is an interface, the abstract keyword and public access modifier are implied
	void swim();
	
	// We can create concrete methods in our interfaces (Java 8+)
	default void floatOnWater() {
		System.out.println("The object floats");
	}
	
	/*
	 * Interfaces create a 'contract' between a class and methods
	 * Every abstract method in an interface, must be implemented
	 * in the concrete class that implements the Interface
	 */
}
