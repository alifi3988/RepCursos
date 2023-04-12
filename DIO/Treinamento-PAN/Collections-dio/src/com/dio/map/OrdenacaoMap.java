/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author alifi
 */
public class OrdenacaoMap {
    public static void main(String[] args) {
        
        
        System.out.println("Adiconando os livros favoritos");
        Map<Integer, Livro> meusLivros = new HashMap<>(){{
            put(5, new Livro("Teste", "Alifi, Santos", 500));
            put(1, new Livro("Uma breve História", "Hawking, Stephen", 256));
            put(2, new Livro("O Poder do Hábito", "Duhigg, Charles", 408));
            put(3, new Livro("21 Lições para o Século 21", "Harari, Yuval Naah", 432));
            put(4, new Livro("Teste", "Alifi, Santos", 500));
            put(6, new Livro("Uma breve História", "Hawking, Stephen", 256));
            put(7, new Livro("O Poder do Hábito", "Duhigg, Charles", 408));
            put(8, new Livro("21 Lições para o Século 21", "Harari, Yuval Naah", 432));
            put(9, new Livro("Teste", "Alifi, Santos", 500));
        }};
        
        System.out.println("\t---Ordem aleatória---\t"); //ordem da key
        for(Map.Entry<Integer, Livro> livro: meusLivros.entrySet()){
        
            System.out.println("Chave [" + livro.getKey() + "]" + livro.getValue());
        }
        
        
        System.out.println("\t---Ordem de Inserção---\t");
        Map<Integer, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put(8, new Livro("O Poder do Hábito", "Duhigg, Charles", 408));
            put(10, new Livro("21 Lições para o Século 21", "Harari, Yuval Naah", 432));
            put(14, new Livro("Teste", "Alifi, Santos", 500));
            put(1, new Livro("Uma breve História", "Hawking, Stephen", 256));
            put(2, new Livro("O Poder do Hábito", "Duhigg, Charles", 408));
            put(3, new Livro("21 Lições para o Século 21", "Harari, Yuval Naah", 432));
            put(4, new Livro("Teste", "Alifi, Santos", 500));
            put(7, new Livro("Uma breve História", "Hawking, Stephen", 256));

        }};
        
        for(Map.Entry<Integer, Livro> livro: meusLivros2.entrySet()){
            System.out.println("Chave[" + livro.getKey() + "]" + livro.getValue());
        }
        
        System.out.println("---\tOrdem pelas chaves\t---");
        Map<Integer, Livro> meusLivros3 = new TreeMap<>(meusLivros2);
        for(Map.Entry<Integer, Livro> livro: meusLivros3.entrySet()){
            System.out.println("Chave[" + livro.getKey() + "]" + livro.getValue());
        }
        
        
        System.out.println("---\tOrdem Alfabética pelo nome dos livros---\t");
        Set<Map.Entry<Integer, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
        
        meusLivros4.addAll(meusLivros2.entrySet());
                
       for(Map.Entry<Integer, Livro> livro: meusLivros4){
           System.out.println("Chave[" + livro.getKey() + "]" + livro.getValue());
       }
        
        
    }
    
}
