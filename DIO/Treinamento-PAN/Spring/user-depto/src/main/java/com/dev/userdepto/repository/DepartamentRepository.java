package com.dev.userdepto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.userdepto.entity.Department;

@Repository
public interface DepartamentRepository extends JpaRepository<Department, Long>{

}
