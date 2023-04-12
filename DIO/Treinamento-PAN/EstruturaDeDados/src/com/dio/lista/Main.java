package com.dio.lista;

public class Main {
    
    
    public static void main(String[] args) {
        
        
        Lista<String> minhaLista = new Lista<>();
        
        minhaLista.add("Teste A");
        minhaLista.add("Teste B");
        minhaLista.add("Teste C");
        minhaLista.add("Teste D");
        
        
        System.out.println(minhaLista.toString());
        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(3));
        System.out.println(minhaLista.isEmpty());
        System.out.println(minhaLista.size());
        System.out.println(minhaLista.remove(1));
        System.out.println(minhaLista.toString());
        
        
    }
    
}
