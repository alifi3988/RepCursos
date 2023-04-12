/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dio.refatoracao;


/**
 *
 * @author alifi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        No<String> n1 = new No<>("Alifi");
        No<Integer> n2 = new No<>(2000);
        No<Character> n3 = new No<>('A');
        No<Boolean> n4 = new No<>(true);
        
        n1.setProximoNo(n2);
        n2.setProximoNo(n3);
        n3.setProximoNo(n4);
        
        System.out.println(n1.toString());
      
        
    }
    
}
