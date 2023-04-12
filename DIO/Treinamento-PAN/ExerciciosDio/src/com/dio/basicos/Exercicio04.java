/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.basicos;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class Exercicio04 {
    
    public static void main(String[] args){
      
        int casos, poderDeLuta;

        Scanner ler = new Scanner(System.in);

        casos = ler.nextInt();

        for(int i = 0; i < casos; i++){
            poderDeLuta = ler.nextInt();    
            if(poderDeLuta <= 8000){
                System.out.println("Inseto!");
            } else {
                System.out.println("Mais de 8000!");
            }
        }
    }
}