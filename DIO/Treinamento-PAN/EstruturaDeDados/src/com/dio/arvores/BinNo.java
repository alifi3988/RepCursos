/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.arvores;

/**
 *
 * @author alifi
 */
public class BinNo<T extends Comparable<T>> {
    
    private T conteudo;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    public BinNo() {
    }

    public BinNo(T conteudo) {
        this.conteudo = conteudo;
        this.noEsq = this.noDir = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    @Override
    public String toString() {
        return "BinNO{" +
                "conteudo=" + conteudo + 
                "}";
    }
    
    
    
    
    
    
    
}
