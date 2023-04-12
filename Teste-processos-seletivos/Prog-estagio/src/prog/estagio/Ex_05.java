/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.estagio;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class Ex_05 {
    
    public static void main(String[] args) {
        
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Informe uma palavra: ");
        String palavra = scn.next();
        
        int tamanho = palavra.length(); //colhendo o tamanho da String
        String nova = "";
        for(int i = tamanho; i >= 0;i--){
            
            if(i-1 < 0) break;
            nova = nova + palavra.charAt(i-1);
        }
        
        System.out.println("Nova palavra : " + nova);
    }
    
}
