package com.dio.springBooatSingletonPrototype.app;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
	
	@Autowired
	private Remetente noreply;

	@Autowired
	private Remetente techTeam;	
	
	public void enviarConfirmacaoCadastro() {
		System.out.println(noreply);
		System.out.println("Seu cadastro foi aprovado!");
	}
	
	public void enviarMensagemBoasVindas() {
		System.out.println("Informe os valores pertinentes para realizar o Cadastro: ");
		System.out.println("Informe o novo nome: ");
		String nome = new Scanner(System.in).next();
		System.out.println("Informe o novo e-mail: ");
		String email = new Scanner(System.in).next();
		
		techTeam.setNome(nome);
		techTeam.setEmail(email);
		
		System.out.println(techTeam);
		System.out.println("Ben-Vindo ao Time Elite!");
	}
	
}
