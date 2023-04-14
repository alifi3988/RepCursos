package com.dio.springBooatPropertiesValue.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
	
	@Value("${nome}")
	private String nome;
	@Value("${email}")
	private String email;
	@Value("${telefones}")
	private List<Long> telefone;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mensagem enviada por: " + this.toString());
		System.out.println("Seu cadastro foi aprovado!");
	}


	@Override
	public String toString() {
		return "[nome=" + nome + ", email=" + email + ", telefone=" + telefone + "]";
	}
	
	
	
	
	
	
	
	

}
