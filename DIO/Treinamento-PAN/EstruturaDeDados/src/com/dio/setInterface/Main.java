package com.dio.setInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    
    public static void main(String[] args) {
        
        
        Set<Carro> hashSetCarro = new HashSet<>();
        
        hashSetCarro.add(new Carro("Teste A"));
        hashSetCarro.add(new Carro("Teste B"));
        hashSetCarro.add(new Carro("Teste C")); 
        hashSetCarro.add(new Carro("Teste D"));
        hashSetCarro.add(new Carro("Teste E"));
        
        System.out.println(hashSetCarro.toString());
        
        //treeset (Arvore) > Tem que configiurar o compareTO
        Set<Carro> treeSetCarro = new TreeSet<>();
        
        treeSetCarro.add(new Carro("Teste AA"));
        treeSetCarro.add(new Carro("Teste B"));
        treeSetCarro.add(new Carro("Teste CCCC")); 
        treeSetCarro.add(new Carro("Teste DDDDDDDD"));
        treeSetCarro.add(new Carro("Teste EEE"));
        
        System.out.println(treeSetCarro.toString());
    }
}
