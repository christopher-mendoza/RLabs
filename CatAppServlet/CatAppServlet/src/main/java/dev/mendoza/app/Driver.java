package dev.mendoza.app;

import java.util.List;

import dev.mendoza.models.Breed;
import dev.mendoza.repositories.BreedRepository;

public class Driver {
	public static void main(String[] args) {
		BreedRepository br = new BreedRepository();
		List<Breed> breeds = br.getAll();
		
		for(Breed b : breeds) {
			System.out.println(b);
		}
		
		System.out.println(br.getById(1));
		
		Breed newBreed = new Breed("bigcat");
		br.add(newBreed);
		System.out.println(br.getAll());

	}
}
