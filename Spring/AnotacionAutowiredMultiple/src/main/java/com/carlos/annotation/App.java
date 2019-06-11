package com.carlos.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		LibroService libroService = appContext.getBean(LibroService.class);
		
		libroService.librosPorGenero("Ciencia ficción").forEach(System.out::println);
		
		
		((ClassPathXmlApplicationContext) appContext).close();

	}

}
