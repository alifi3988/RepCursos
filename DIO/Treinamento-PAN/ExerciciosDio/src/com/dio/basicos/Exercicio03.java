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
public class Exercicio03 {
    public static void main(String[] Args) {

     double h = 0;
     Scanner sc = new Scanner(System.in);
     double n = sc.nextDouble();
     
     for (double i = 1; i <= n; i++) {
        h = h + (1/i);
     }
     //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
     System.out.println(String.format("%.0f", h));
       
   }
}