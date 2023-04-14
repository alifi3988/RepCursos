package com.dio.springBooatSingletonPrototype.app;

public class Remetente {
	
	private String nome;
	private String email;

	public Remetente(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	
	
	public Remetente() {
		super();
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Remetente [nome=" + nome + ", email=" + email + "]";
	}
	
	

}
