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
public class Ex_02 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = 0;
        while(true){
            //tratamento
            try {
                //entrada de dado
                System.out.println("Informe um número: ");
                n = scn.nextInt(); //entrada do valor
                break;
            } catch (Exception e) {
                System.out.println("Valor informado não estpa correto!");
            }
        }
        int fibonacci = 1;
        int auxiliar = 0;
        
        do{ 
            System.out.print(fibonacci + "  ");
            fibonacci = fibonacci + auxiliar;
            auxiliar = fibonacci - auxiliar;
       
            if(fibonacci == n){
                System.out.println("\nO valor informado FAZ parte da sequência!");
                break;
            }else if(fibonacci > n){
                System.out.println("\nO valor informado NÃO faz parte da sequência!");
                break;
            }
        }while(fibonacci != n);
        
        
    }
    
    
}
