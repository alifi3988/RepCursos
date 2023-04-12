/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author alifi
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        Queue<Carro> queue = new LinkedList<>();
        
        queue.add(new Carro("Teste 01"));
        queue.add(new Carro("Teste 02"));
        queue.add(new Carro("Teste 03"));
        queue.add(new Carro("Teste 04"));
        
        System.out.println(queue.add(new Carro("Teste 05")));
    }
    
}
