package dev.mendoza.inheritance;

public class Car {
	// Instance Variables
	private String name; // model of the car
	private int mileage;
	private String color;
	
	// Constructor
	public Car(String name, int mileage, String color) {
		this.name = name;
		this.mileage = mileage;
		this.color = color;
	}
	
	public Car() {
		System.out.println("Calling the car constructor");
	}
	
	// Getters and Setters
	// (trusted mediators between the rest of the program and data in this class' fields)
	public String getName() {
		return this.name;
	}
	
	public int getMileage() {
		return this.mileage;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setName(String name) {
		if(name == null) {
			System.out.println("Name cannot be null!");
			return;
		}
		this.name = name; 
	}
	
	public void setMileage(int mileage) {
		if(mileage < 0) {
			System.out.println("Mileage cannot be less than 0!");
			return;
		}
		this.mileage = mileage;
	}
	
	public void setColor(String color) {
		if(color == null) {
			System.out.println("Color cannot be null!");
			return;
		}
		this.color = color;
	}
	
	// Methods
	public void drive() {
		System.out.println("The car drives");
	}
	
	public void drive(int distance) {
		System.out.println("The car drives " + distance + " miles");
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", mileage=" + mileage + ", color=" + color + "]";
	}

}
