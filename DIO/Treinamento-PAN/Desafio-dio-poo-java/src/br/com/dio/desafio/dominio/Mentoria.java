package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;

	public Mentoria() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Mentoria(String titulo, String desc, LocalDate data) {
		super();
		setTitulo(titulo);
		setDescricao(desc);
		this.data = data;
	}




	// Métodos GETS E SETS
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	

	@Override
	public String toString() {
		return "Mentoria [getData()=" + getData() + ", getTitulo()=" + getTitulo() + ", getDescricao()="
				+ getDescricao() + "]";
	}

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20;
	}
	
}
