// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 

import java.util.Scanner;

public class Main {
	
    //função para realizar a operação de um produto
    public static Double calcularValor(Produto produto, int qtdProduto) {  	
        if(qtdProduto <= 5) {
         	return produto.getValorX() * qtdProduto;
        }else{
        	return produto.getValory() * qtdProduto;
        }
    }
    
    
    //iniciação do main
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       int morangos = input.nextInt();
       int macas = input.nextInt();
       
       
       
       double valorTotal = calcularValor(new Produto("Morango", 2.50, 2.20), morangos) + calcularValor(new Produto("Morango", 1.80, 1.50), macas);
       
       if((morangos + macas) > 8 || valorTotal > 25.00) {
    	   double valorTemp  = valorTotal - (0.1 * valorTotal);
    	   valorTotal = valorTemp;
       }
       
       
       System.out.println(valorTotal);

       //TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
      
    }
}

class Produto{
	
	//atributos
	private String nome;
	private double valorX;
	private double valorY;
	
	public Produto(String nome, double valorX, double valory) {
		super();
		this.nome = nome;
		this.valorX = valorX;
		this.valorY = valory;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorX() {
		return valorX;
	}
	public void setValorX(double valorX) {
		this.valorX = valorX;
	}
	public double getValory() {
		return valorY;
	}
	public void setValory(double valory) {
		this.valorY = valory;
	}
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valorX=" + valorX + ", valory=" + valorY + "]";
	}
}