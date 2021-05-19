package dev.mendoza.abstraction;

public abstract class Star {
	/*
	 * Abstract CLass is a class that cannot be instantiated.
	 * Abstract Classes often contain unimplemented methods that MUST be overriden by a concrete subclass
	 * 
	 * You can have concrete methods in an Abstract Class
	 * 
	 * But - any class that has an abstract method - MUST be an Abstract Class
	 * 
	 * Abstract Methods - are methods that have no implementation (no body). They are only a method signature.
	 * Any concrete subclass that extends this abstract class will be required to implement all of the abstract methods.
	 */

	public String name;
	public int age;
	
	public abstract void superNova();
	
	public abstract void twinkle();
	
	public void solarFlare() {
		System.out.println("Lots of radiation.");
	}
}
