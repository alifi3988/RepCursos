/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.pilha;

/**
 *
 * @author alifi
 */
public class Main {
    public static void main(String[] args) {
        
        
        Pilha minhaPilha = new Pilha();
        
        minhaPilha.push(new No(1000));
        minhaPilha.push(new No(2000));
        minhaPilha.push(new No(3000));
        minhaPilha.push(new No(4000));
        minhaPilha.push(new No(5000));
        minhaPilha.push(new No(6000));
        
        System.out.println(minhaPilha.toString());
    }
}
