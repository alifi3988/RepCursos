package com.api.parkingcontrol.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.parkingcontrol.model.ParkingSpotModel;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID>{
	
	
	//métodos que são inseridos para verificação
	//para verificar a placa do veículo
	boolean existsParkingSpotModelByLicencePlateCar(String licensePlateCar);
	
	/*/Verificando se o número da vaga existe
	boolean existsByParkingSpotNumber(String parkingSpotNumber);
	
	//verificar se o apartamento e o bloco existem
	boolean existsByApartamentAndBlock(String apto, String bloco);*/
	
}
