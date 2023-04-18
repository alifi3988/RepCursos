package com.example.dioclass.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dioclass.apirest.Person;


//aqui é somente uma interface, que terá os componentes do JpaRepository, que é uma outra interface.
//serve para trazer os métodos para persistência de dados
@Repository()
public interface PersonRepository extends JpaRepository<Person, Long> {
	
	
	
}
