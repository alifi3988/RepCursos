package com.example.dioclass.apirest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.dioclass.apirest.repository.EmployeeRepository;
import com.example.dioclass.apirest.repository.PersonRepository;

@SpringBootApplication
public class ApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunnerPerson(PersonRepository repositoryPersonal) {
		return args ->{
			repositoryPersonal.save(new Person("Álifi Augusto", "Santos"));
			repositoryPersonal.save(new Person("Leonardo Tirado", "Spadaro"));
			
		};		
	};
	
	
	@Bean
	CommandLineRunner commandLineRunnerEmployee(EmployeeRepository repositoryEmployee) {
		return args -> {
			repositoryEmployee.save(new Employee("Alifi", "Técnico de TI", "R. Miguel Couto, 344"));
			repositoryEmployee.save(new Employee("Alifi", "Rua Miguel Couto", "Sei lá"));
		
			
		};
	};
	
}
