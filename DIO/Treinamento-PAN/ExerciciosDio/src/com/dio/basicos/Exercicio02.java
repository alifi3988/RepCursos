/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.basicos;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class Exercicio02 {
  public static void main(String[] args) throws IOException {
    
    Scanner leitor = new Scanner(System.in);
    int cont = 0;
    double media = 0;
    double x;

    //TODO: Implemente as condições adequadas para obter a quantidade 
    //de valores positivos e a média dos valores positivos:
    for (int i = 0; i < 6; i++) {
      x = leitor.nextDouble();
      if(x > 0){
        cont++;
        media = media + x;
      }
      
    }

    media = media/cont;
    
    System.out.println(cont + " valores positivos");
    System.out.println(String.format("%.1f", media));
  }
	
}