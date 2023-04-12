/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.map;

import java.util.Comparator;
import java.util.Map;

/**
 *
 * @author alifi
 */
public class ComparatorNome implements Comparator<Map.Entry<Integer, Livro>>{

    
    //nesse modo de comparação, ele verifica pelo nome, autor, se forem iguais, ele vai pelo ID
    @Override
    public int compare(Map.Entry<Integer, Livro> l1, Map.Entry<Integer, Livro> l2) {
        if(l1 == null) return 0;
        else if(l2 == null) return 0;
        
        if(l1.getValue().getNome() == l2.getValue().getNome()){
            if(l1.getValue().getAutor() == l2.getValue().getAutor()){
                return l1.getKey().compareTo(l2.getKey());
            }
            return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
        }
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }

    
}
