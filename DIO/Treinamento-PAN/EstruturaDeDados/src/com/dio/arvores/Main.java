/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.arvores;

/**
 *
 * @author alifi
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();
        
        minhaArvore.insert(new Obj(13));
        minhaArvore.insert(new Obj(10));
        minhaArvore.insert(new Obj(25));
        minhaArvore.insert(new Obj(2));
        minhaArvore.insert(new Obj(12));
        minhaArvore.insert(new Obj(20));
        minhaArvore.insert(new Obj(31));
        minhaArvore.insert(new Obj(29));
        
        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();
        
        
    }
    
}
