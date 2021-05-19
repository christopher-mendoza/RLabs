package dev.mendoza.inheritance;

public class Subaru extends Car {
	public Subaru() {
		// super("Subaru", 0, "black"); // All super is doing is calling the parent class (Car)
		System.out.println("Calling the Subaru constructor");
	}
	
	public Subaru(String name, int mileage, String color) {
		// Constructor Chaining - Implicitly calls the parent constructor
		super(name, mileage, color);
		
	}

	/*
	 * Method Overriding: Dynamic or Runtime Polymorphism
	 * 
	 */
	@Override // this annotation is not necessary, but a good failsafe
	public void drive() {
		System.out.println("Subarus drive nice on snow");
	}
	
	@Override
	public String toString() {
		return "Subaru [name=" + getName() + ", mileage=" + getMileage() + ", color=" + getColor()
				+ "]";
	}
	
	
	
}
