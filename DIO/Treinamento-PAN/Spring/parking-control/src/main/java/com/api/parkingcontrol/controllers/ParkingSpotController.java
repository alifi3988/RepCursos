package com.api.parkingcontrol.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.parkingcontrol.dtos.ParkingSpotDto;
import com.api.parkingcontrol.model.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import com.api.parkingcontrol.service.ParkingSpotService;
import jakarta.validation.Valid;

@RestController
public class ParkingSpotController {
	
	///ponto de injeção de controle
	@Autowired
	private ParkingSpotService parkingSpotService;
	
	
	//post (inserção de dados)					  
	//@RequestBody => criando em JSON
	//@Valid => chamando a classe validadora de dados para verificar se está tudo certo. Se não tiver ele já emite um erro
	@RequestMapping("/insert")
	public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDto parkingSpotDto){

		var parkinSpotModel = new ParkingSpotModel(); //versão utilizando o tipo "var"
		
		BeanUtils.copyProperties(parkingSpotDto, parkinSpotModel); //copiando os dados de dto para model
		parkinSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC"))); //pegando a data e hora atual e inserindo no model
		ResponseEntity.ok("Veículo registrado. Dados válidos!"); ///mensagem de ok
		return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.save(parkinSpotModel)); 
		//retornando um status em HTTP ("Criado") e no corpo está salvando o model
	}

}
