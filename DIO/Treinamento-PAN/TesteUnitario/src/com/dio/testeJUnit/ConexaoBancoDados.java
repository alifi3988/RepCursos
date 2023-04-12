/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.testeJUnit;

/**
 *
 * @author alifi
 */
public class ConexaoBancoDados {
    
    
    
    public static void iniciarConexaoBanco(){
        System.out.println("Iniciou Conexão!");
    }
    
    
    public static void fecharConexaBanco(){
        System.out.println("Fechou Conexão!");
    }
    
    public static Boolean adicionarPessoaBanco(Pessoa pessoa){
        System.out.println("Pessoa Inseruda com sucesso!");
        return true;
    } 
    
    
    public static Boolean removerPessoaBanco(Pessoa pessoa){
        System.out.println("Pessoa removida com sucesso!");
        return true;
    }
    
}
