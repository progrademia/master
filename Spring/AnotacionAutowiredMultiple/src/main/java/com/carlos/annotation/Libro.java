package com.carlos.annotation;

public class Libro {
	
	private String titulo;
	private String anyo;
	private String genero;
	
	public Libro() {	}
	
	public Libro(String titulo, String anyo, String genero) {
		this.titulo = titulo;
		this.anyo = anyo;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAnyo() {
		return anyo;
	}

	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", anyo=" + anyo + ", genero=" + genero + "]";
	}

	
	
	
	

}
