package com.carlos.annotation;

import java.util.Collection;


public interface LibroDao {
	
	public Libro findById(int id);
	public Collection<Libro> findAll();
	public void insert(Libro pelicula);
	public void edit(Libro antigua, Libro nueva);
	public void delete(Libro pelicula);
}
