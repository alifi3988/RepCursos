/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.heranca;

/**
 *
 * @author alifi
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        int n = 1;
        int x = 0;
        int i;
        
        while(n<10){
            
            if(n%2!= 0){
                for (i = 3; i*i<=3;i+=2){
                    if(n%i == 0) break;
                }
                if(i<n) x++;
            }
            n++;
        }
        System.out.println(x);
     
    }
    
}
