import java.util.Scanner;


public class Main {
	
	
  public static void main(String[] args) {
	  
     Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     
     String[] strSplit = str.split(" ");
     
     char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
     
     int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
     
         
     for (String item : strSplit) {

    	 
    	 
    	 for(int i = 0; i < item.length(); i++) {
    		 if(item.charAt(i) == arrVogais[0] || 
    				 item.charAt(i) == arrVogais[1] ||
    				 item.charAt(i) == arrVogais[2] ||
    				 item.charAt(i) == arrVogais[3] ||
    				 item.charAt(i) == arrVogais[4]) {
    			 quantVogais++;
    			 
    		 }
    		 if(item.charAt(i) == 'A' || 
    				 item.charAt(i) == 'E' ||
    				 item.charAt(i) == 'I' ||
    				 item.charAt(i) == 'O' ||
    				 item.charAt(i) == 'U') {
    			 quantVogais++;
    			 
    		 }
    	 }
     }

    
    System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
  
	//TODO: Implemente condições (laços) adequados para que possamos contar os espaços em brancos e as vogais que existem na string
	//Dica: Você pode utilizar o Character.toLowerCase em sua condição: 
    
  }
  
  
}