package com.api.parkingcontrol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.parkingcontrol.model.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import jakarta.transaction.Transactional;


/***
 * 
 * @author alifi
 *
 */
@Service
public class ParkingSpotService {
	
	
	//ponto de injeção | Aqui avisa para o ParkingSpotService que será preciso injetar algumas dependências
	@Autowired
	ParkingSpotRepository parkingSpotRepository;
	
	public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}
	
	//criando o método SAVE
	//nesse método save, no caso ele está com a anotation 
	//@Transactional que serve para proteger os dados quando realizar as transações
	//tendo a possibilidade de um rolback, e faça com que os dados não sejam perdidos
	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return save(parkingSpotModel);
	}
	
	
	public boolean existsParkingSpotModelByLicencePlateCar(String licensePlateCar) {
		return parkingSpotRepository.existsParkingSpotModelByLicencePlateCar(licensePlateCar);
	}

}


