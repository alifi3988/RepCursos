/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.modelagemPrimaria;

/**
 *
 * @author alifi
 */
public final class Carro {
    
    String  cor;
    String  modelo;
    int   capacidadeTanque;
    boolean status;
    int km;

    
    //Construtores
    public Carro() {
        
        setCapacidadeTanque(0);
        setCor(null);
        setModelo(null);
        setStatus(false);
        setKm(0);
    }

    public Carro(String cor, String modelo, int capacidadeTanque) {
        setCor(cor);
        setModelo(modelo);
        setCapacidadeTanque(capacidadeTanque);
        setStatus(false);
        setKm(0);
    }
    
    
    //Métodos gets e sets
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public int getKm() {
        return km;
    }
    

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setKm(int km) {
        this.km = km;
    }

    
    //Métodos
    public void ligarCarro(){
        if(isStatus() == false)
            setStatus(true);
        else
            System.out.println("Veículo está ligado já!");
    }
    
    public void desligarCarro(){
        if(isStatus() == true)
            setStatus(false);
        else
            System.out.println("Veículo está desligado já!");
    }
    
    public double totalValorTanque(double valorCombustivel){
        return getCapacidadeTanque() * valorCombustivel;
    }
    
    public void acelerarCarro(){
        
        if(getKm() < 100){
            setKm(getKm() + 5);
        }else{
            System.out.println("Limite de Aceleração");
        }
    }
    
    public void desacelerarCarro(){
        
        if(getKm() > 0){
            setKm(getKm() - 5);
        }else{
            System.out.println("Limite mínimo de Aceleração");
        }
    }
    
    public void frearCarro(){
        setKm(10);
        System.out.println(getKm() + "Km/H");
        setKm(5);
        System.out.println(getKm() + "Km/H");
        setKm(0);
        System.out.println(getKm() + "Km/H");
        System.out.println("Carro parado!");
    }

    @Override
    public String toString() {
        return "Carro{" + "cor=" + cor + ", modelo=" + modelo + ", capacidadeTanque=" + capacidadeTanque + ", status=" + status + ", km=" + km + '}';
    }
    
    
}
