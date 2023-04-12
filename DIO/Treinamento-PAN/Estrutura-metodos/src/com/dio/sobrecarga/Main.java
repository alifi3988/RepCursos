/*
 * CRIA UMA APLICAÇÃO QUE CALCULE A ´REA DOS 3 QUADRILÁTEROS NOTÁVEIS: QUADRADO, RETANGULO E TRAPÉZIO
 * USE A SOBRECARGA
 */
package com.dio.sobrecarga;

/**
 *
 * @author alifi
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Área Trapézio : " + areaQuadrilatero(9, 24, 15));
        System.out.println("Área Retângulo: " + areaQuadrilateros(9, 9));
        System.out.println("Área Quadrado : " + areaQuadrilateros(9, 9));   
    }
    
    public static int areaQuadrilateros(int base, int altura){
        return base * altura;     
    }
    
    public static int areaQuadrilatero(int baseMenor, int BaseMaior, int altura){
        return ((baseMenor + BaseMaior) * altura)/2;
    }
   
}
