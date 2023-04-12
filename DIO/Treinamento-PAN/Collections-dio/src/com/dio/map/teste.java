/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.map;

import java.util.List;

/**
 *
 * @author alifi
 */
public class teste {
    public static void main(String[] args) {
        List<String> numeros = List.of("1", "2");
        
        System.out.println(numeros.stream().mapToInt(Integer::parseInt).average());
    }
}
