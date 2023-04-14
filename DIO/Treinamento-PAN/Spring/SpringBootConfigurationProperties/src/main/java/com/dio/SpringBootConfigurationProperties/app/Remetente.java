package com.dio.SpringBootConfigurationProperties.app;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties("remetente")
public class Remetente {
	
	
	private String nome;
	private String email;
	private List<Long> telefones;
	
	public Remetente() {
		// TODO Auto-generated constructor stub
	}
	
	public Remetente(String nome, String email, List<Long> telefones) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefones = telefones;
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
	public List<Long> getTelefone() {
		return telefones;
	}
	public void setTelefone(List<Long> telefone) {
		this.telefones = telefone;
	}
	
	@Override
	public String toString() {
		return "Remetente [nome=" + nome + ", email=" + email + ", telefone=" + telefones + "]";
	}
	
	
	
	

}
