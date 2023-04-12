package com.dio.metodos;

import java.util.Date;
import java.util.Scanner;


public class Main {
    
   
    public static void main(String[] args) {
        
        horaDia();
        operacoesBasicas(10, 20);
        emprestimo();
        
    }
    
 public static void operacoesBasicas(int v1, int v2){
        
        System.out.println("=======================");
        System.out.println("* * *  RESULTADO * * *");
        System.out.println("SOMA: " + (v1+v2));
        System.out.println("SUBTRAÇÃO: " + (v1-v2));
        System.out.println("MULTIPLICAÇÃO: " + (v1*v2));
        System.out.println("DIVISÃO: " + (v1/v2));
        System.out.println("=======================");
        
    }
    
 public static void horaDia(){
        
        String frase;
        Date dt = new Date();
        
        if(dt.getHours() >= 5 && dt.getHours() < 12){
            frase = "Bom dia";
        }else if(dt.getHours() >= 12 && dt.getHours() < 18){
            frase = "Boa tarde";
        }else{
            frase = "Boa noite!";
        }
        System.out.println(frase);
    }

 
 public static void emprestimo(){
     
     double jurosMensal = 5;
     
     
     Scanner scn = new Scanner(System.in);
     
     System.out.println("==============================================");
     System.out.println("Informe o valor que deseja: ");
     double valor = scn.nextDouble();
     System.out.println("Informe o número de parcelas: ");
     int par = scn.nextInt();
     System.out.println("==============================================");
     
     double jurosAnual = (Math.pow((1+(jurosMensal/100)), 12) - 1) * 100;
     
     double valorFinal = ((5/100) * valor) * par;
     
     System.out.println("Valor Final Juros Mensal: R$ " + valorFinal);
     System.out.println("Juros mensal: " + jurosMensal + "%");
     System.out.println("Juros Anual: " + jurosAnual + "%");
 }
}