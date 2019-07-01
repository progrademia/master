package com.curso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PeliculaDaoImplMemory implements PeliculaDao {

	private List<Pelicula> peliculas = new ArrayList<>();
	
	public Pelicula findById(int id) {
		return peliculas.get(id);
	}

	public Collection<Pelicula> findAll() {
		return peliculas;
	}

	public void insert(Pelicula pelicula) {
		peliculas.add(pelicula);
	}

	public void edit(Pelicula antigua, Pelicula nueva) {		
		peliculas.remove(antigua);
		peliculas.add(nueva);		
	}

	public void delete(Pelicula pelicula) {
		peliculas.remove(pelicula);
	}
	
	public void init() {
		insert(new Pelicula("p1", "1978","Ciencia ficción"));
		insert(new Pelicula("p2","1978","Drama"));
		insert(new Pelicula("p3", "1978", "Drama"));
		insert(new Pelicula("p4", "1978", "Drama"));
		insert(new Pelicula("p5", "1978", "Acción"));
		insert(new Pelicula("p6","1978","Comedia"));
		
		
	}

}
