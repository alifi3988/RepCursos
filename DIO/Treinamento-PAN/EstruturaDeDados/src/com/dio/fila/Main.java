/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.fila;

/**
 *
 * @author alifi
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        
        FilaI minhaFila = new FilaI();
        minhaFila.enqueue(new No("Primeiro"));
        minhaFila.enqueue(new No("Segundo"));
        minhaFila.enqueue(new No("Terceiro"));
        minhaFila.enqueue(new No("Quarto"));
        
        System.out.println(minhaFila);
        minhaFila.dequeue();
        System.out.println(minhaFila);
        minhaFila.dequeue();
        System.out.println(minhaFila);
        
    }
    
}
