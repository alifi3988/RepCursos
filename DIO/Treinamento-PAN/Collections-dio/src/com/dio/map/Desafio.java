/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class Desafio {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("* * * Entrada de dados * * *");
        System.out.println("Informe 100 dados do tipo String(pode repetir os dados).");
        
        
        //criação do map
        Map<Integer, String> valores = new HashMap<>();
        
        //colhendo os dados 1 - 100
        for(int i = 1; i <= 100;i++){
            //System.out.print("Informe o valor: ");
            //String dado = scn.nextLine();
            
            //colocando no map
            valores.put(i, i+"");
        }
        System.out.println("\n* * * \t Mostrando os valores inseridos * * *\t");
        for(Map.Entry<Integer, String> valor : valores.entrySet()){
            System.out.println("Key[" + valor.getKey() + "]" + " - Valor = " + valor.getValue());
        }
        
        System.out.println("\n* * * \tMostrando quantas vezes cada valor foi inserido * * *\t");
        for(Map.Entry<Integer, String> valor : valores.entrySet()){
            int cont = 0;
            for(Map.Entry<Integer, String> v : valores.entrySet()){
                if(v.getValue() == valor.getValue()){
                    cont++;
                }
            }
            System.out.println("Valor: " + valor.getValue() + " - Foi inserido: " + cont + " vezes");
        }
        
        
        
        
        
        
        
    }
    
}
