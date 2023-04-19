import java.io.IOException;
import java.util.Scanner;

//Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
//- new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
//- System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

public class Main {
	
	public static double verificarMaior(double A, double B, double C) {
		
		if(A > B) {
			if(A > C) 
				return A;
		}
		
		if(B > A){
			if(B > C) 
				return C;
		}
		
		return C;
		
	}
	
	public static String verificarTriangulo(double A, double B, double C, boolean resultado) {
		
		//calculando o perímetro
		if(resultado == true) {
			return "Perimetro = " + (A + B + C);
		}else {
			//área do trapézio
			return "Area = " + (((A + B) * C) / 2);
				
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double maior;
		double soma;
		boolean triangulo = false;
		
		//verificando qual é o maior
		maior = verificarMaior(A, B, C);
		
		//realizando a soma
		if(maior == A) {
			soma = B + C;
			if(A >= soma) {
				triangulo = false;
			}else {
				triangulo = true;
			}
		}else if(maior == B) {
			soma = A + C;
			if(B >= soma) {
				triangulo = false;
			}else {
				triangulo = true;
			}
		}else if(maior == C) {
			soma = B + A;
			if(C >= soma) {
				triangulo = false;
			}else {
				triangulo = true;
			}
		}
		
		System.out.println(verificarTriangulo(A, B, C, triangulo));

		
		//TODO: Implemente a condição necessária para o cálculo do triângulo:
		//Dica: Você pode utilizar o String.format() na formatação do texto.
		
		
	}
	
}