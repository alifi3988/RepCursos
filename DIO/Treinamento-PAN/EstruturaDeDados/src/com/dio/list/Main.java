/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alifi
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        List<Carro> listaCarro = new ArrayList<>();
        listaCarro.add(new Carro("Teste 01"));
        listaCarro.add(new Carro("Teste 02"));
        listaCarro.add(new Carro("Teste 03"));
        
        System.out.println(listaCarro.toString());
        
        System.out.println(listaCarro.contains(new Carro("Teste 01")));
        
        System.out.println(listaCarro.get(2));
        
                
    }
    
    
    
    
    
}
