/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author alifi
 */
public class ExemploMap {
    public static void main(String[] args) {
        
        System.out.println("\nCrie um dicionário que relacione os modelos e seus respectivos valores de consumo.");
        //criação e inserção dos valores em um dicionário (não pode chaves repetidas, no caso é o modelo do veículo é a chave)
        //inserção aleatória
        Map<String, Double> carrosPopulares = new HashMap<>();
        carrosPopulares.put("Gol", 14.4);
        carrosPopulares.put("Uno", 15.6);
        carrosPopulares.put("Mobi", 16.1);
        carrosPopulares.put("HB20", 14.5);
        carrosPopulares.put("KWID", 15.6);
        
        System.out.println(carrosPopulares);
        
        System.out.println("\nSubstitua o consumo de gol por 15.2 km/l");
        carrosPopulares.put("Gol", 16.1);
        System.out.println(carrosPopulares);
        
        System.out.println("\nConfira se o modelo Tucson está no dicionário");
        System.out.println("Resposta: " + carrosPopulares.containsKey("Tucson")); //false
        
        System.out.println("\nExiba o consumo do Uno: " + carrosPopulares.get("Uno"));
        
        System.out.println("\nExiba os modelos");
        System.out.println("Modelo: " + carrosPopulares.keySet()); //retorna um SET com os keys(modelo)
        
        System.out.println("\nExiba o consumo dos carro");
        System.out.println("Consumo dos carros: " + carrosPopulares.values()); //retorna uma Collection com os valores
        
        System.out.println("\nExiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloEconomico = "";
        
        for(Map.Entry<String, Double> entry: entries){
            if(Objects.equals(entry.getValue(), consumoMaisEficiente)){
                modeloEconomico = entry.getKey();
                System.out.println("Modelo mais economico: " + modeloEconomico + " | Consumo: " + consumoMaisEficiente);
            }
        }
        
        System.out.println("\nExiba o modelo menos economico e seu consumo");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries2 = carrosPopulares.entrySet();
        String modeloMenosEconomico = "";
        
        for(Map.Entry<String, Double> entry: entries2){
            if(Objects.equals(entry.getValue(), consumoMenosEficiente)){
                modeloMenosEconomico = entry.getKey();
                System.out.println("Modelo menos economico: " + modeloMenosEconomico + " | Consumo: " + consumoMenosEficiente);
            }
        }
        
        System.out.println("\nExiba a soma dos consumos dos veículos");
        double soma = 0;
        for(Double val: carrosPopulares.values()){
            soma = soma + val;
        }
        
        System.out.println("Soma: " + soma);
        
        System.out.println("\nExiba a média do consumo: ");
        System.out.printf("Média: %.2f", (soma/carrosPopulares.size()));
        
        System.out.println("\nRemova os modelo como consumo igual a 15,6KM/L");
        System.out.println(carrosPopulares);
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals(15.6)){
                iterator.remove();
            }
        }
        System.out.println(carrosPopulares);
        
        System.out.println("\nMostrar na ordem de inserção");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("KWID", 15.6);
        }};
        System.out.println(carrosPopulares2);
        
        System.out.println("\nExiba o dicionario exibindo ordenado pelo modelo");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares);
        System.out.println(carrosPopulares3.toString());
        
        System.out.println("\nApague o dicionário de carros pp");
        carrosPopulares.clear();
        System.out.println(carrosPopulares); //verificando se a lista está vazia
        
        System.out.println("\nVerificando se o dicionario está vazio");
        if(carrosPopulares.isEmpty()){
            System.out.println("Vazio!");
        }
        
        
        
    }
    
}
