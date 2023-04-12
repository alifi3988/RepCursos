/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.listaCirculares;

/**
 *
 * @author alifi
 * @param <T>
 */
public final class No<T> {
    
    private T conteudo;
    private No<T> proxRef;

    public No() {
        setConteudo(null);
        setProxRef(null);
    }
    
    public No(T conteudo) {
        setConteudo(conteudo);
        setProxRef(null);
    }
    
    public No(T conteudo, No<T> proxRef) {
        setConteudo(conteudo);
        setProxRef(proxRef);
    }
    
    
    //GETS E SETS
    public T getConteudo() {
        return conteudo;
    }
    public No<T> getProxRef() {
        return proxRef;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    public void setProxRef(No<T> proxRef) {
        this.proxRef = proxRef;
    }

    @Override
    public String toString() {
        //retornando o conteúdo do nó, e o conteúdo do próximo
        return "No[Conteúdo: " + getConteudo()
                + "Próximo : " + getProxRef().getConteudo();
    }
    
    
    
    
    
    
    
}
