package com.dev.userdepto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPrincipal {

	//irá mostrar uma mensagem inical (localhost:8080)
	@GetMapping("/")
	public String welcomeInicial() {
		return "Seja Bem-Vindo(a)!";
	}
	
}
