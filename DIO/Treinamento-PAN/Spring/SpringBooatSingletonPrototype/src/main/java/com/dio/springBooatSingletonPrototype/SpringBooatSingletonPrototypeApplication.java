package com.dio.springBooatSingletonPrototype;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.dio.springBooatSingletonPrototype.app.SistemaMensagem;

@SpringBootApplication
public class SpringBooatSingletonPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBooatSingletonPrototypeApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) throws Exception{
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
			
		};
	}

}
