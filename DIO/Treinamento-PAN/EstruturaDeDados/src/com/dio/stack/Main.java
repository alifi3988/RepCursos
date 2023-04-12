/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.stack;

import java.util.Stack;

/**
 *
 * @author alifi
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        Stack<Carro> stackCarros = new Stack<>();
        
        
        stackCarros.push(new Carro("Teste 01"));
        stackCarros.push(new Carro("Teste 02"));
        stackCarros.push(new Carro("Teste 03"));
        
        System.out.println(stackCarros.toString());
        
        System.out.println(stackCarros.pop());
        
        System.out.println(stackCarros.toString());
        
        System.out.println(stackCarros.peek());
        
        System.out.println(stackCarros.toString());
        
        System.out.println(stackCarros.isEmpty());

        
    }
    
}
