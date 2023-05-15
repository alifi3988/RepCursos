package com.api.parkingcontrol.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


/***
 * Aqui será realizado as verificações de cada dado. Por exemplo se está vazio, 
 * Se o CPF está correto, entre outras verificações
 * @author alifi
 *
 */

public class ParkingSpotDto {
	
	@NotBlank(message = "Núemero da vaga não está preenchido corretamente!")
	private String parkingSpotNumber;
	
	@NotBlank(message = "Placa do veículo não está preenchido corretamente!")
	@Size(max = 7)
	private String licencePlateCar;
	
	@NotBlank(message = "Modelo do veículo não está preenchido corretamente!")
	private String brandCar;
	
	@NotBlank(message = "Modelo do veículo não está preenchido corretamente!")
	private String modelCar;
	
	@NotBlank(message = "Cor do veículo não está preenchido corretamente!")
	private String colorCar;
	
	@NotBlank(message = "Nome do responsável não está preenchido corretamente!")
	private String responsibleName;
	
	@NotBlank(message = "Número do apartamento não está preenchido corretamente!")
	private String apartment;
	
	@NotBlank(message = "Bloco do Apto. não está preenchido corretamente!")
	private String block;
	

	public String getParkingSpotNumber() {
		return parkingSpotNumber;
	}

	public void setParkingSpotNumber(String parkingSpotNumber) {
		this.parkingSpotNumber = parkingSpotNumber;
	}

	public String getLicencePlateCar() {
		return licencePlateCar;
	}

	public void setLicencePlateCar(String licencePlateCar) {
		this.licencePlateCar = licencePlateCar;
	}

	public String getBrandCar() {
		return brandCar;
	}

	public void setBrandCar(String brandCar) {
		this.brandCar = brandCar;
	}

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public String getColorCar() {
		return colorCar;
	}

	public void setColorCar(String colorCar) {
		this.colorCar = colorCar;
	}

	public String getResponsibleName() {
		return responsibleName;
	}

	public void setResponsibleName(String responsibleName) {
		this.responsibleName = responsibleName;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	@Override
	public String toString() {
		return "ParkingSpotDto [parkingSpotNumber=" + parkingSpotNumber + ", licencePlateCar=" + licencePlateCar
				+ ", brandCar=" + brandCar + ", modelCar=" + modelCar + ", colorCar=" + colorCar + ", responsibleName="
				+ responsibleName + ", apartment=" + apartment + ", block=" + block + "]";
	}
	
	//métodos que podem ser importantes para a realização de cadastro
	



}
