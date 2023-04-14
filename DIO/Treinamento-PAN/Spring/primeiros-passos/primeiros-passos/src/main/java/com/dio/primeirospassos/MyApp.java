package com.dio.primeirospassos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner{
	
	@Autowired
	private Calculadora calculadora;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\nO resultado da soma é: " + calculadora.somar(7,2));
		
	}
}
