/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.modelagemPrimaria;

/**
 *
 * @author alifi
 */
public class Main {
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Preto", "Onix 1.4", 40);
        
        System.out.println(c1);
        
        c1.ligarCarro();
        System.out.println("Situação carro: " + c1.isStatus());
        
        c1.acelerarCarro();
        c1.acelerarCarro();
        c1.acelerarCarro();
        c1.acelerarCarro();
        
        System.out.println("Velocidade: " + c1.getKm());
        
        c1.frearCarro();
        
        System.out.println("Velocidade: " + c1.getKm());
        
        c1.desligarCarro();
        
        
    }
    
}
