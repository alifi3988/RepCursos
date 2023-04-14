package com.dio.springBootBeansComponents;

import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;


public class Beans {
	
	@Bean
	public Gson geson() {
		return new Gson();
	}
}
