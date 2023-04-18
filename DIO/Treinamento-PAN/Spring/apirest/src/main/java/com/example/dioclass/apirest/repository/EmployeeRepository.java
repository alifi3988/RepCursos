package com.example.dioclass.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dioclass.apirest.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
