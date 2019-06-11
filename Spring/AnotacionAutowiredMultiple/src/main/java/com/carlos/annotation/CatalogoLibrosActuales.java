package com.carlos.annotation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CatalogoLibrosActuales implements CatalogoLibros {

	public List<Libro> libros = new ArrayList<>();
	
	public Collection<Libro> getLibros() {
		return libros;
	}
	
	public void init() {
		libros.add(new Libro("Libro1", "2015", "Ciencia ficción"));
		libros.add(new Libro("Libro2", "2014", "Acción"));
		libros.add(new Libro("Libro3", "2014", "Comedia"));
		libros.add(new Libro("Libro4", "2013", "Acción"));
		libros.add(new Libro("Libro5", "2012", "Ciencia ficción"));
		libros.add(new Libro("Libro6", "2011", "Comedia"));
	}

}
