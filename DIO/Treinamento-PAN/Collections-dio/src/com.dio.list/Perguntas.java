/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author alifi
 */
public class Perguntas {
    public static void main(String[] args) {
        
        List<String> perguntas = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        String resp;
        
        System.out.println("Responda com [S/N] as perguntas...");
        
        while(true){
            try {
                System.out.print("Telefonou para a vítima: ");
                resp = scn.nextLine().toUpperCase();
                scn.close();
                if(verificadorResp(resp)){
                    perguntas.add(resp);
                    System.out.print("Esteve no local do crime: ");
                    resp = scn.nextLine().toUpperCase();
                    scn.close();
                }
                if(verificadorResp(resp)){
                    perguntas.add(resp);
                    System.out.println("Mora perto da vítima: ");
                    resp = scn.nextLine().toUpperCase();
                    scn.close();
                }
                if(verificadorResp(resp)){
                    perguntas.add(resp);
                    System.out.println("Devia para a vítim: ");
                    resp = scn.nextLine().toUpperCase();
                    scn.close();
                }
                if(verificadorResp(resp)){
                    perguntas.add(resp);
                    System.out.println("Já trabalhou com a vítima: ");
                    resp = scn.nextLine().toUpperCase();
                    scn.close();
                }
                if(verificadorResp(resp)){
                    perguntas.add(resp);
                    scn.close();
                    break;
                } 
            } catch (Exception e) {
                System.out.println("Erro na resposta. Não confere com o solicitado!");
            } 
        }
        
        if(perguntas.contains("S")){
            int cont = 0;
            
            for(String s : perguntas){
                if(s == "S"){
                    cont++;
                }
            }
            if(cont == 2){
                System.out.println("Suspeita");
            }else if(cont > 2 && cont <=4){
                System.out.println("Cúmplice");
            }else if(cont > 4){
                System.out.println("Assasina");
            }else{
                System.out.println("Inocente");
            }
                
        }else{
            System.out.println("Inocente!");
        }
        
        
        
    }
    
    public static Boolean verificadorResp(String resp){
        System.out.println(resp);
        return resp == "S" || resp == "s" || resp == "n" || resp == "N";
    }
    
}
