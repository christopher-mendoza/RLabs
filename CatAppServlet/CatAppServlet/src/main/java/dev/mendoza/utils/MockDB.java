package dev.mendoza.utils;

import java.util.ArrayList;
import java.util.List;

import dev.mendoza.models.Breed;
import dev.mendoza.models.Cat;
import dev.mendoza.models.Person;

public class MockDB {
	public static List<Person> peeps = new ArrayList<Person>();
	public static List<Cat> cats = new ArrayList<Cat>();
	public static List<Breed> breeds = new ArrayList<Breed>();
	
	// Create mock data for our database
	static {
		
		// Cats
		Cat c = new Cat(1, "North", 4);
		cats.add(c);
		c = new Cat(2, "Casper", 2);
		cats.add(c);
		cats.add(new Cat(3, "Imhotep", 8000));
		cats.add(new Cat(4, "Cusco", 2));
		cats.add(new Cat(5, "The Most Interesting Man in the World", 5));
		cats.add(new Cat(6, "Paddington", 2));
		cats.add(new Cat(7, "Caleb", 3));
		cats.add(new Cat(8, "Benji", 20));
		cats.add(new Cat(9, "Rue", 8));
		
		// Breeds
		breeds.add(new Breed(1, "Calico"));
		breeds.add(new Breed(2, "Sphynx"));
		breeds.add(new Breed(3, "Maine Coon"));
		breeds.add(new Breed(4, "Tabby"));
		breeds.add(new Breed(5, "Scottish Fold"));
		
		// Person
		peeps.add(new Person(1, "catman", "mancat"));
		peeps.add(new Person(2, "johnR", "lasagna"));
		peeps.add(new Person(3, "phoebe", "smellycat"));
		peeps.add(new Person(4, "dan", "proudcatdad"));
		peeps.add(new Person(5, "jess", "outlander"));
	}
	
	public static void main(String[] args) {
		for(Cat c : cats) {
			System.out.println(c);
		}
		System.out.println();
		for(Breed b : breeds) {
			System.out.println(b);
		}
		System.out.println();
		for(Person p : peeps) {
			System.out.println(p);
		}
	}
}
