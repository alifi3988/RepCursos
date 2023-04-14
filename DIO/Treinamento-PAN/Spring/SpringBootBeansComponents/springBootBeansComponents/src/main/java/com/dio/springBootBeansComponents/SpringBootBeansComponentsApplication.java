package com.dio.springBootBeansComponents;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootBeansComponentsApplication {

	public static void main(String[] args) {SpringApplication.run(SpringBootBeansComponentsApplication.class, args);}
	
	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception{
		
		return args -> {
			String json = "{\"cep\": \"01001-000\", \"logradouro\": \"Praça da Sé\", \"Localidade\": \"Sei lá onde\"";
			
			ViaCepresponse response = conversor.converter(json);
			//System.out.println("Dados do CEP: " + response);
			System.out.println(json);
		};
	}
}
