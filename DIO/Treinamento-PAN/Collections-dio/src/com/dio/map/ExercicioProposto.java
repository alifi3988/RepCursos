/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author alifi
 */
public class ExercicioProposto {
    public static void main(String[] args) {
        
        //Criação do dicionário e relacionando com as suas populações
        System.out.println("\n***\tCriação do Dicionário\t*** ");
        Map<String, Integer> estadosBrasileiros = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("Mostrando dicionário....");
        for(Map.Entry<String, Integer> estado:estadosBrasileiros.entrySet()){
            System.out.println("Estado: " + estado.getKey() + " | População: " + estado.getValue());
        }
        
        System.out.println("\n***\tSubstituindo a população do RN por 3534165\t***");
        estadosBrasileiros.put("RN", 3534165);
        System.out.println("Mostrando dicionário....");
        for(Map.Entry<String, Integer> estado:estadosBrasileiros.entrySet()){
            System.out.println("Estado: " + estado.getKey() + " | População: " + estado.getValue());
        }
                
        System.out.println("\n***\tConfira se o estado PB está no dicionário, se não add\t***");
        if(!estadosBrasileiros.containsKey("PB")){
            System.out.println("Estado não está. Add PB - População de 4.039.277");
            estadosBrasileiros.put("PB", 4039277);
        }
        System.out.println("Mostrando dicionário....");
        for(Map.Entry<String, Integer> estado:estadosBrasileiros.entrySet()){
            System.out.println("Estado: " + estado.getKey() + " | População: " + estado.getValue());
        }
        
        System.out.println("\n***\tMostrando a População de PE ***\t");
        for(Map.Entry<String, Integer> estado: estadosBrasileiros.entrySet()){
            if(estado.getKey() == "PE"){
                System.out.println("Estado PE >> População: " + estado.getValue());
            }
        }
        
        System.out.println("\n***\tInformar os estados na ordem que foi inseridos***\t");
        Map<String, Integer> estadosBrasileiros2 = new LinkedHashMap<>(estadosBrasileiros);
        for(Map.Entry<String, Integer> estado:estadosBrasileiros2.entrySet()){
            System.out.println("Estado: " + estado.getKey() + " | População: " + estado.getValue());
        }
        
        System.out.println("\n***\tExiba os estados e a população em ordem Alfabética***\t");
        Map<String, Integer> estadosBrasileiros3 = new TreeMap<>(estadosBrasileiros);
        for(Map.Entry<String, Integer> estado:estadosBrasileiros3.entrySet()){
            System.out.println("Estado: " + estado.getKey() + " | População: " + estado.getValue());
        }
        
        System.out.println("\n***\tExibir MIN, MAX, SOMA, MÉDIA das Populações ***\t");
        System.out.println("Mínimo: " + Collections.min(estadosBrasileiros3.values()));
        System.out.println("Máximo: " + Collections.max(estadosBrasileiros3.values()));
        int soma = 0;
        for(Map.Entry<String, Integer> estados : estadosBrasileiros3.entrySet()){
            soma = soma + estados.getValue();
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " +(soma/estadosBrasileiros3.size()));
        
        
        System.out.println("\n***\tRemova os estados com menor que 4.000.000 população");
        Iterator<Integer> interator = estadosBrasileiros3.values().iterator();
        while(interator.hasNext()){
            if(interator.next() < 4000000){
                interator.remove();
            }
        }
        for(Map.Entry<String, Integer> estado:estadosBrasileiros3.entrySet()){
            System.out.println("Estado: " + estado.getKey() + " | População: " + estado.getValue());
        }
        
        System.out.println("\n***\tApague o dicionário***\t");
        estadosBrasileiros3.clear();
        
        if(estadosBrasileiros3.isEmpty()){
            System.out.println("Dicionário Vazio!");
        }
        
    }
    
}
