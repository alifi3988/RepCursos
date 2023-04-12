/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.set;

/**
 *
 * @author alifi
 */
public class Cores implements Comparable<Cores>{
    
    private String nome;

    public Cores(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cores{" + "nome=" + nome + '}';
    }

    @Override
    public int compareTo(Cores o) {
        if(getNome() == o.getNome()){
            return 0;
        }else if(getNome().length() > o.getNome().length()){
            return 1;
        }else{
            return -1;
        }
    }

}
