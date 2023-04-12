/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author alifi
 */
public class SetInterface {
    public static void main(String[] args) {
        
        //exemplos de exercicios com o SetInterface
        
        
        
        System.out.println("Criando um conjunto de notas com o SET");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //reparar:
        /*
        * - não segue nenhuma ordem para mostrar os valor
        */
        System.out.println(notas.toString());
        
        
    }
    
}
