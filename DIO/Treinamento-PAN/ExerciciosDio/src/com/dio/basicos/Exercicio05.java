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
public class Exercicio05 {
    
    public static void main(String[] args) throws IOException {
        
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        int proximo, atual = 1, anterior = 0;
        
        //String list = "0";
        
        for (int i = 1; i <= N; i++) {
            if(i == N) System.out.println(anterior);
            
            else System.out.print(anterior + " ");
            proximo = anterior + atual;
            anterior = atual - anterior;
            atual = atual + anterior;
        }
    }
}