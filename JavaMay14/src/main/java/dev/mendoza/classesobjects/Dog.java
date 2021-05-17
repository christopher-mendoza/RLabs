package dev.mendoza.classesobjects;

/*
 * Classes:
 * 		- represent real-world things
 * 		- serve the role of a software module (collections of related methods
 * 		  and necessary variables
 * 
 * As real-world representation:
 * 		- Each 'instance' of a class (what we refer to as an Object)
 * 		  represents a single 'thing'
 * 		- i.e. Two cars of the same make/model, but with different VINs,
 * 		  color, mileage, etc.
 * 
 * As a software module:
 * 		- Generally we only create one instance of the class at a time.
 * 
 * A class is a blueprint for objects
 * 		- it outlines behaviors and shared states for instances
 * 		- values of those states may change independently of the other instances
 * 
 * An object's state is unique to itself.
 * Each object operates 
 */
public class Dog {

	// Instance variables - unique/specific to each instance of the class that we create
	String name;
	String breed;
	int age;
	boolean isFed;
	
	/*
	 * Constructors - are used to create objects - "Instantiating a class"
	 * 
	 * When a class' constructor is run - a new object is created from the class.
	 * (Class -> Blueprint for objects)
	 * 
	 * Constructors are really just special methods.
	 * 		- They have no return type
	 * 		- They always have the same name as the class in which they're defined
	 * 		- Every class MUST have at least one constructor
	 * 			- If you do provide one, the default constructor is 'lost'
	 */
	
	// No-args constructor - Exactly what a compiler provides as a default constructor
	public Dog() {
		
	}
	
	// Constructors can have parameters (Parameterized Constructor)
	//		This is how we overload constructors
	public Dog(String name, String breed, int age) {
		this.name = name;   // the 'this' keyword is used for self-reference
		this.breed = breed; // references the object in question
		this.age = age;     // Calls the method
		this.isFed = false;
	}
	
	// Methods that are unique to this class (sometimes talked about as behaviors
	//		when speaking abstractly)
	public void bark() {
		System.out.println("bork");
	}
	
	// Method Overloading - We can have multiple methods with the same name
	//		as long as they have different number/type of parameters
	public void bark(int times) {
		for(int i = 0; i < times; i++) {
			bark();
		}
	}
	
	@Override
	public String toString() {
		return "Dog [name = " + this.name +
			        ", breed = " + this.breed +
			        ", age = " + this.age + 
			        ", isFed = " + this.isFed + "]";
	}
	
	public void bark(String s) {
		System.out.println("We bark again");
	}
	// Notice that this class has no main method - we don't need one
}
