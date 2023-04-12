/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.no;

/**
 *
 * @author alifi
 */
public final class No {
    private String conteudo;
    private No proximoNo;


    //contrutor da classe No
    public No(String conteudo){
        setConteudo(conteudo);
        this.proximoNo = null;
    }

    //Métodos Guets e Sets
    public String getConteudo() {
        return conteudo;
    }
    public No getProximoNo() {
        return proximoNo;
    }
    public void setConteudo(String conteudo) {
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
