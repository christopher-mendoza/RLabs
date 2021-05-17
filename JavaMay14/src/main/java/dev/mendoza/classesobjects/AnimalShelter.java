package dev.mendoza.classesobjects;

public class AnimalShelter  {

	public static void main(String[] args) {
		// Use the constructor to create a Dog Object
		// This will reserve the memory needed to store all information about our Dog Object
		// Datatype + reference variable = new keyword + Constructor();
		
		Dog myDog = new Dog(); // Reference Variable - stores an object location in memory
		
		myDog.name = "Steve";
		myDog.bark();
		
		Dog notMyDog = new Dog();
		
		notMyDog.name = "Jane";
		notMyDog.bark(3);
		
		System.out.println(myDog.name);
		System.out.println(notMyDog.name);
		
		Dog[] dogArray = new Dog[3];
		dogArray[0] = myDog;
		dogArray[1] = notMyDog;
		
		for(Dog d : dogArray) {
			System.out.println(d);
		}
		
		// When printing an object - we are implicitly calling the .toString() method on it
		// toString() is a method provided by the Object Class
		// 
	}
}
