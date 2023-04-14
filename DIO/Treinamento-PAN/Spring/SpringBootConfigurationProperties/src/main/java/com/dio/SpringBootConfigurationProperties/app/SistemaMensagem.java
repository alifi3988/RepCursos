package com.dio.SpringBootConfigurationProperties.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class SistemaMensagem implements CommandLineRunner {
	
	@Autowired
	private Remetente remetente;
	
	@Override
	public void run(String... args) throws Exception {
			
		System.out.println(
				"Mensagem enviada por: Nome: " + remetente.getNome() + " | Email: " + remetente.getEmail()
				);
		System.out.println("Cadastro foi realizado!");
	}
}
