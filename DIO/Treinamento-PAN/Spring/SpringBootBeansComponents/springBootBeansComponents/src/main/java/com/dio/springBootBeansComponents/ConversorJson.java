package com.dio.springBootBeansComponents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.google.gson.Gson; 


@Component
public class ConversorJson {
	
	@Autowired
	private Gson gson;
	
	public ViaCepresponse converter(String json) {
		ViaCepresponse response = gson.fromJson(json, ViaCepresponse.class);
		return response;
	}
	

}
