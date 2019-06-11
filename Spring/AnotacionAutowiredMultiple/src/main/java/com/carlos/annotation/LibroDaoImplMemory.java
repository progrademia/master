package com.carlos.annotation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class LibroDaoImplMemory implements LibroDao {

	private List<Libro> libros = new ArrayList<>();
	
	@Autowired
	private Set<CatalogoLibros> catalogosLibros;
	
	
	public void init() {
		for (CatalogoLibros c : catalogosLibros) {
			libros.addAll(c.getLibros());
		}
	}
	
	public Libro findById(int id) {
		return libros.get(id);
	}

	public Collection<Libro> findAll() {
		return libros;
	}

	public void insert(Libro libro) {
		libros.add(libro);
	}

	public void edit(Libro antiguo, Libro nuevo) {		
		libros.remove(antiguo);
		libros.add(nuevo);		
	}

	public void delete(Libro libro) {
		libros.remove(libro);
	}
	
	

}
