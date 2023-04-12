package com.dio.modelagemPrimaria;

public class Livro {
    
    //atributos
    private String nome;
    private String autor;
    private String editora;
    private String dataPublicacao;
    private int qtdEstoque;
    private double valorUnitario;

    
    //construtores
    public Livro() {
    }

    public Livro(String nome, String autor, String editora, String dataPublicacao, int qtdEstoque, double valorUnitario) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
        this.qtdEstoque = qtdEstoque;
        this.valorUnitario = valorUnitario;
    }

    //Métodos gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", autor=" + autor + ", editora=" + editora + ", dataPublicacao=" + dataPublicacao + ", qtdEstoque=" + qtdEstoque + ", valorUnitario=" + valorUnitario + '}';
    }
    
    
    
    
    
    
}
