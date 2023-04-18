package com.example.dioclass.apirest;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_enployee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String name;
	private String address;
	private String role;
	
	//construtor
	public Employee(String name, String endereco, String role) {
		super();
		this.name = name;
		this.address = endereco;
		this.role = role;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	//getters e setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEndereco() {
		return address;
	}

	public void setEndereco(String endereco) {
		this.address = endereco;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	//toString

	@Override
	public String toString() {
		return "Enployee [id=" + id + ", name=" + name + ", endereco=" + address + ", role=" + role + "]";
	}
	
	
	//hashCode e Equals
	@Override
	public int hashCode() {
		return Objects.hash(address, id, name, role);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(role, other.role);
	}
		
}
