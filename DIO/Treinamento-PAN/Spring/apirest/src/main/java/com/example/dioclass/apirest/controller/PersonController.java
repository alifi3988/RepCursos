package com.example.dioclass.apirest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.dioclass.apirest.Person;
import com.example.dioclass.apirest.repository.PersonRepository;

//aqui será definido os métodos de requisição

@RestController
public class PersonController {
	
	private final PersonRepository repositoryPerson; //instanciando o repositório de Person

	
	//contrutor do Método
	public PersonController(PersonRepository repositoryPerson) {
		super();
		this.repositoryPerson = repositoryPerson;
	}
	
	///será mostrado na raíz
	@GetMapping("/")
	public String helloWorld() {
		return "This is my first API in Spring Boot JPA! ^^";
	}
	
	
	//Métodos de Requisição com o banco de dados
	
	@GetMapping("/persons") //informando o caminho, para quando for buscar no navegador (localhost/persons)
	public List<Person> consultAllPerson() {	
		return repositoryPerson.findAll();
	}
	
	
	@GetMapping("/persons/{id}")
	public Optional<Person> consultById(@PathVariable Long idPerson) {
		System.out.println(repositoryPerson.findById(idPerson));
		return repositoryPerson.findById(idPerson);
	}
	
	
	
	
	

}
