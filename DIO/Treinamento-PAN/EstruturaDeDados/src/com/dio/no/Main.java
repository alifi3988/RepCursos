/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.dio.no;

/**
 *
 * @author alifi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        No n1 = new No("Betina");
        No n2 = new No("Betania");
        No n3 = new No("Alisson");
        No n4 = new No("Alifi");
        
        n1.setProximoNo(n2);
        n2.setProximoNo(n3);
        n3.setProximoNo(n4);
        
        System.out.println(n1.toString());
      
        
    }
    
}
