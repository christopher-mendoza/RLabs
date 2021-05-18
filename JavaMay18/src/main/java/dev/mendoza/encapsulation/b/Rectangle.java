package dev.mendoza.encapsulation.b;

import dev.mendoza.encapsulation.a.Shape;

// extends is the keyword we use to create child classes or subclasses
public class Rectangle extends Shape {
	
	public void publicRectangleMethod() {
		System.out.println("Public Rectangle Method");
		this.protectedMethod();
	}
	
}
