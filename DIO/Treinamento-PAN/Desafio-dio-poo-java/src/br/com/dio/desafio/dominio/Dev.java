package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.DoubleStream;

public class Dev {
	
	
	private String nome;
	
	//a utilização do LinkdHashSet é util para não ter repetição de elementos
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public Dev() {
		// TODO Auto-generated constructor stub
	}
	
	public Dev(String nome) {
		super();
		this.nome = nome;
	}





	//métodos da classe
	public void inscreverBootcamp(Bootcamp bootcamp) {
		
		//pegando todos os conteudos e colocando no set
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		
		//escrevendo o dev no Bootcamp
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {		
		
		//Optional ele resolve conteudos nullos
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get()); //add no setConcluido
			this.conteudosInscritos.remove(conteudo.get()); //removendo do setInscrito
		}else {
			System.err.println("Você não está matriculado em nenhum conteúdo!");
		}
		
	}
	
	
	public double calcularTotalXp() {
		
		return this.conteudosConcluidos
				.stream()
				.mapToDouble(Conteudo::calcularXp)
				.sum();
	}
	
	
	//Métodos Gets e Sets

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	
	
	//Métodos a mais 
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Dev [nome=" + nome + ", conteudosInscritos=" + conteudosInscritos + ", conteudosConcluidos="
				+ conteudosConcluidos + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
