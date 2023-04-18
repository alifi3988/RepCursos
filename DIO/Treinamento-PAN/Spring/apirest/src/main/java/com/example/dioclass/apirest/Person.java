package com.example.dioclass.apirest;

//importações da classe
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



//essa classe será persistida no Banco de dados
@Entity
public class Person {
	
	//criação dos atributos da classe /table
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //geração automática do ID
	private Long id;
	
	private String firstName;
	private String lastName;
	
	//construtores
	public Person(String nomePerson, String lastName) {
		
		this.firstName = nomePerson;
		this.lastName = lastName;
	}

	public Person() {
	}

	
	//getters e setters
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firName) {
		this.firstName = firName;
	}
	
	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//toString
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}


}
