package com.carlos.annotation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

public class LibroService {
	
	@Autowired
	private LibroDao libroDao;
	
	public void setLibroDao(LibroDao libroDao) {
		this.libroDao = libroDao;
	}
		
	public List<Libro> librosPorGenero(String genero) {
		return libroDao
				.findAll()
				.stream()
				.filter(p -> p.getGenero().equalsIgnoreCase(genero))
				.collect(Collectors.toCollection(ArrayList::new));
	}
	
}
