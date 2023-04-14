package com.dio.academiadigital.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


//CRIAÇÃO DA ENTIDADE (POR AQUI QUE SERÁ GERADA A TABELA NO CASO: ALUNO)
/*
@NoArgsConstructor
@AllArgsConstructor 
@RequiredArgsConstructor
->> Eles não estavam funcionando, por isso tive que colocar os getts e setts direito
*/


@Data //simplifica a não realização dos metos get-set...
@NoArgsConstructor
@AllArgsConstructor 
@RequiredArgsConstructor
@Entity
@Table(name="tb_alunos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_aluno")
	private Long id;
	
	private String nome;
	
	@Column(name = "cpf", unique = true)
	private String cpf;
	
	private String bairro;
	
	@Column(name = "dataNascimento")
	private LocalDate dataDeNascimento;
	
	@Column(name = "avaliacoes")
	@OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY) //terá várias avaliações, por isso OneToMany | O LAZY no caso, faz com que não aparece os campos avaliações quando buscar os dados, pois pode ser grande de mais (terá um endpoint expecifico para ele)
	@JsonIgnore
	private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

	
	//contrutores | getts | sets | toString
	//tive que add os métos por a annotation não estava funcionando
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public LocalDate getDataNascimento() {
		return dataDeNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataDeNascimento = dataNascimento;
	}

	public List<AvaliacaoFisica> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<AvaliacaoFisica> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", bairro=" + bairro + ", dataNascimento="
				+ dataDeNascimento + ", avaliacoes=" + avaliacoes + "]";
	}
	
	//tive que realizar
	
	
}
