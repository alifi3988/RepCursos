package com.example.dioclass.apirest.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.dioclass.apirest.Employee;
import com.example.dioclass.apirest.exception.EmployeeNotFoundException;
import com.example.dioclass.apirest.repository.EmployeeRepository;


public class EmployeeController {

	private final EmployeeRepository repository;
	
	public EmployeeController(EmployeeRepository repository) {
		this.repository = repository;
	}
	
	
	//listar todos registrados
	@GetMapping("/employees")
	public List<Employee> listOfEnployeeAll(){
		
		return repository.findAll();
	}
	
	
	//pegar o Employee pelo ID se não encontrar vai lançar uma exception
	@GetMapping("/employee/{id}")
	public Employee consultByID(@PathVariable Long idEmployee) {
		return repository.findById(idEmployee).orElseThrow(()-> new EmployeeNotFoundException(idEmployee));
	}
	
	@PostMapping("/employees")
	public Employee newEmployee(@RequestBody Employee newEmployee) {
		return repository.save(newEmployee);
		
	}
	
	
	@PutMapping("/employees/{id}")
	Employee replaceEmployee(@RequestBody Employee newEmployee, long id) {
		return repository.findById(id).map(e -> {
			e.setName(newEmployee.getName());
			e.setEndereco(newEmployee.getEndereco());
			e.setRole(newEmployee.getRole());
			return repository.save(newEmployee);
		}).orElseGet(()->{
			newEmployee.setId(id);
			return repository.save(newEmployee);
		});
	}
	
	@DeleteMapping
	void deleteEmployee(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	
}
