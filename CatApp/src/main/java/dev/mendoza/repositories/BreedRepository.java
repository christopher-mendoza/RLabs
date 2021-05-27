package dev.mendoza.repositories;

import java.util.List;

import dev.mendoza.models.Breed;
import dev.mendoza.utils.MockDB;

public class BreedRepository implements GenericRepository<Breed> {

	public Breed add(Breed b) {
		Breed breed = MockDB.breeds.stream()
				.max((b1, b2) -> b1.getId().compareTo(b2.getId()))
				.orElse(null);
		Integer id = (breed != null) ? breed.getId() + 1 : 1;
		b.setId(id);
		MockDB.breeds.add(b);
		return b;
	}

	// Using streams to simulate connecting and retrieving and sending information
	// data to and from a database
	public Breed getById(Integer id) {
		Breed b = MockDB.breeds.stream()
				.filter((breed) -> breed.getId() == id)
				.findFirst().orElse(null);
		return b;
	}

	public List<Breed> getAll() {
		return MockDB.breeds;
	}

	public void update(Breed change) {
//		Integer id = MockDB.breeds.indexOf(change);
//		change.setId(id);
	}

	public void delete(Breed b) {
		MockDB.breeds.remove(b);
	}

}
