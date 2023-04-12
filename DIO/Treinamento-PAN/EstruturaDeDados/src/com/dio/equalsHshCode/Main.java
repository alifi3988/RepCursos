/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.equalsHshCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alifi
 */
public class Main {
    
    public static void main(String[] args) {
        
        List<Carro> listaC = new ArrayList<>();
        
        Carro c1 = new Carro("Teste 01");
        Carro c2 = new Carro("Teste 02");
        
        listaC.add(new Carro("FORD"));
        listaC.add(new Carro("CHEVROLET"));
        listaC.add(new Carro("VW"));
        
        System.out.println(listaC.toString());
        
        System.out.println("Resultado = " + c1.equals(c2));
        
    }
    
}
