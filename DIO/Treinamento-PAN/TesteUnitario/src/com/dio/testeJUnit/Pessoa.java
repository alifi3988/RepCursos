package com.dio.testeJUnit;

import java.time.LocalDate;

public class Pessoa {
    
    private String          nome;
    private LocalDate   anoNascimento;
    private double          altura;
    private double          peso;
    private String          corPele;
    private String          cpf;

    public Pessoa(String nome, LocalDate anoNascimento, double altura, double peso, String corPele, String cpf) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
        this.corPele = corPele;
        this.cpf = cpf;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(LocalDate anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", anoNascimento=" + anoNascimento + ", altura=" + altura + ", peso=" + peso + ", corPele=" + corPele + ", cpf=" + cpf + '}';
    }
    
    
    //métodos a parte
    public int verificarIdade(LocalDate data){
        return 2023 - data.getDayOfYear(); 
    }
    
    public Boolean verificarMaiorDeIdade(int idade){
        return idade >= 18;
    }

}
