/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.set;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author alifi
 */
public class SetExplicacao {
    
    public static void main(String[] args){
       /* // 1º Verificação
		System.out.println("Criando/Add um conjunto de notas");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 0d, 3.6));
		//mostrando o set de notas
		System.out.println(notas); // a forma de mostrar será desordenada
		
		//2º verificação
		System.out.println("Confira se a nota 5.0 está no conjunto");
		System.out.println("Resposta: " + notas.contains(5.0));  
		
		//3º verificação
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		//4º verificação
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		//5º verificação
		System.out.println("Exibir a soma das notas do conjunto");
                    Interator<Double> interator = notas.interator();
                
		Double soma = 0.0;
		while(interator.hasNext()){
			Double next = interator.next();
			soma += next;
		}
		System.out.println("Soma: " + soma);
	
		//6º verificação
		System.out.println("Média das notas: " + (soma / notas.size()));
		
		//7º verificação
		System.out.println("Remova a nota 0");
		notas.remove(0d);
		System.out.println(notas);
		
		//8º Verificação
		System.out.println("Remova as notas menores que 7");
		Interator<Double> int2 = notas.int2();
		
		while(int2.hasNext()){
			Double next = int2.next();
			if(next<7) int2.remove();
		}
		System.out.println(notas);
		
		
		//9º verificação
		//Nessa verificação vamos trabalhar com o LinkdHasSet, pois ele mostrará de forma ordenada
		//Ele não aceita elementos repetidos
		System.out.println("Exiba todas as notas na ordem que foram informadas ");
		Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 0d, 3.6));
		System.out.println(notas2);
		
		//10º Verificação
		System.out.println("Exiba todas as notas na ordem crescente");
		//Nessa verificação vamos trabalhar com o treeSet, visto que ele trazerá em ordem
		Set<Double> notas3 = new TreeSet<>(notas2); //para dar certo no caso tenho que passar um objeto que tenha o comparable
		System.out.println(notas3); //mostrará ordenado
		
		//11º verificação
		System.out.println("Apagar todo o conjunto");
		notas.clear();
		System.out.println(notas);
*/
    }
    
}
