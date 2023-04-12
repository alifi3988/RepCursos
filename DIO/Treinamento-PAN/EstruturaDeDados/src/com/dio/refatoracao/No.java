/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.refatoracao;

/**
 *
 * @author alifi
 * @param <T>
 */

//trabalhando com classe do tipo Genérico
public final class No<T>{
    
    private T conteudo;
    private No<T> proximoNo;


    //contrutor da classe No
    public No(T conteudo){
        setConteudo(conteudo);
        this.proximoNo = null;
    }

    //Métodos Guets e Sets
    public T getConteudo() {
        return conteudo;
    }
    public No getProximoNo() {
        return proximoNo;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    //Método ToString
    @Override
    public String toString() {

        String msg = "Conteúdo do Nó: " + getConteudo() +
        "\nPróximo nó: " + getProximoNo();

        return msg;
    }
}
