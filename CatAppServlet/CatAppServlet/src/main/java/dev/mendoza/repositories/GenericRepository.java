package dev.mendoza.repositories;

import java.util.List;

public interface GenericRepository<T> {

	// These will be the methods that align the CRUD operations (how we interact with the database)
	
	// CREATE
	public T add(T t);
	
	// READ
	public T getById(Integer id);
	public List<T> getAll();
	
	// UPDATE
	public boolean update(T change);
	
	// DELETE
	public boolean delete(T t);
}
