package dev.mendoza.passbyvalueexample;

public class Example {

	// You can define classes in other classes
	// Static so that we do not need an instance of the Example Class
	//    in order to make a Dog instance
	public static class Dog {
		String name;
	}
	
	public static void main(String[] args) {
//		int x = 5;
//		change(x);
//		System.out.println(x);
//		x = actuallyChange(x);
//		System.out.println(x);
		
		Dog d = new Dog();
		d.name = "Petunia";
		System.out.println(d.name);
		
		anotherChange(d);
		
		System.out.println(d.name);
	}
	
	public static void someChange(Dog d) {
		// Because Java is pass by value - this does not change the Dog d in main method
		// we passed the value of d into this method - value of d -> reference to an address/location in memory
		// Then we call a new Constructor() -> 
		//	   and because Java makes copies of values that it passes into methods
		//	   this d now points to a new location in memory
		d = new Dog();
		d.name = "Jimmy";
	}
	
	public static void anotherChange(Dog d) {
		d.name = "Gamer";
	}
	
	public static void change(int x) { // Java makes a copy of the value of x (Primitive)
		// and so - even if we set x = 10, this does not affect x in main().
		x = 10;
	}
	
	// if we wanted to change the value of x,
	public static int actuallyChange(int x) {
		x = 10;
		return x;
	}
}
