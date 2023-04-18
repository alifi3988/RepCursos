package com.example.dioclass.apirest;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import com.example.dioclass.apirest.repository.EmployeeRepository;
import ch.qos.logback.classic.Logger;


@Configuration
public class LoadBD {
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(LoadBD.class);
	
	
	/*//modo de receber o log de tudo que está acontecendo (INTERESSANTE)
	CommandLineRunner commandLineRun(EmployeeRepository repository) {
		return args->{
			log.info("LOG OF EVENT SAVE USER 1: " + repository.save(new Employee("Alifi", "Técnico de TI", "R. Miguel Couto, 344")));
			log.info("LOG OF EVENT SAVE USER 2: " + repository.save(new Employee("Alifi", "Rua Miguel Couto", "Sei lá")));
		};

	}*/

}
