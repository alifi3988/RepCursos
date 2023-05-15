package br.com.idtrust.analista.implantacao;

import java.util.Scanner;

/**
 * 
 * @param args
 * 
 *  SOLUCIONANDO O EX. EXTRA PROPOSTO 01
 * 
 */
public class ResolucaoExtra_01 {

	public static void main(String[] args) {
		
		//realização para entrada de dados
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Informe os valores de acordo com o solicitado:");
		
		//sexo
		System.out.print("Sexo [masculino] ou [feminino]: ");
		String sexo = scn.next().toLowerCase();
		
		//idade
		System.out.print("Idade: ");
		int idade = scn.nextInt();
		
		System.out.println(sexo);
		System.out.println(idade);
		
		//realizando as verificações de acordo com as regras
		if((sexo.equals("masculino")) && (idade >= 65)) {
			System.out.println("APOSENTADO");
		}
		
		else if(sexo == "feminino" && idade >= 60) {
			System.out.println("APOSENTADA");
		}
		
		else if(idade >= 13 && idade < 18) {
			System.out.println("ADOLESCENTE");
		}
		
		else if(idade < 13) {
			System.out.println("CRIANÇAS");
		}
		
		else {
			System.out.println("ADULTO");
		}
		
	}

}
