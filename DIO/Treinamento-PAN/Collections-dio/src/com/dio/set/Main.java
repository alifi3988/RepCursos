/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.set;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author alifi
 */
public class Main {
    public static void main(String[] args) {
        
        //CRIE UM CONUUNTO CONTENDO AS CORES DO ARCO IRIS
        Set<Cores> arcoIris = new TreeSet<>();
        arcoIris.add(new Cores("Azul"));
        arcoIris.add(new Cores("Verde"));
        arcoIris.add(new Cores("Amarelo"));
        arcoIris.add(new Cores("Vermelho"));
        arcoIris.add(new Cores("Rosa"));
        arcoIris.add(new Cores("Roxo"));
        arcoIris.add(new Cores("Lilas"));
        arcoIris.add(new Cores("Branco"));
        
        System.out.println(arcoIris);
        int cont = 0;
        System.out.println("A - Exiba todas as cores uma abaixo da outra:");
        for(Cores c: arcoIris){
            System.out.println(c.toString());
            cont++;
        }
        
        System.out.println("B - A quantidade de cores que o arco-íris tem: ");
        System.out.println(cont);
        
        System.out.println("Em ordem Alfabética: ");

        
        
    }
    
}
