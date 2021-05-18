package dev.mendoza.encapsulation.a;

public class Shape {

	public void publicMethod() {
		System.out.println("Hello from the public method!");
	}
	
	protected void protectedMethod() {
		System.out.println("Hello from the protected method!");
	}
	
	// With default access, there is no access modifier
	void defaultMethod() {
		System.out.println("Hello from the default method!");
	}
	
	private void privateMethod() {
		System.out.println("Hello from the private method!");
	}
}
