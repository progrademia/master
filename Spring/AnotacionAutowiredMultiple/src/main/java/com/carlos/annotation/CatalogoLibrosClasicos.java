package com.carlos.annotation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CatalogoLibrosClasicos implements CatalogoLibros {

	public List<Libro> libros = new ArrayList<>();
	
	public Collection<Libro> getLibros() {
		return libros;
	}
	
	public void init() {
		libros.add(new Libro("Libro clásico1", "1900", "Ciencia ficción"));
		libros.add(new Libro("Libro clásico2", "1870", "Drama"));
		libros.add(new Libro("Libro clásico3", "1875", "Comedia"));
		libros.add(new Libro("Libro clásico4", "1855", "Bélico"));
		libros.add(new Libro("Libro clásico5", "1856", "Acción"));
		libros.add(new Libro("Libro clásico6", "1877", "Drama"));
	}

}
