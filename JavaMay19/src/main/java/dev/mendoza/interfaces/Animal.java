package dev.mendoza.interfaces;

public abstract class Animal {
	public int numberOfLives = 1;
	
	public Animal() {
		System.out.println("Animal Constructor called");
	}
	
	public abstract void makeSound();
	
	public void exist() {
		System.out.println("The animal is existing");
	}

	@Override
	public String toString() {
		return "Animal [numberOfLives=" + numberOfLives + "]";
	}

}
