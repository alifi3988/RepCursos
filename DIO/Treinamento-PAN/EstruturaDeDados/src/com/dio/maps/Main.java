package com.dio.maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        
        
       Map<String, String> aluno = new HashMap<>();
       
       aluno.put("Nome", "Álifi Augusto");
       aluno.put("Idade", "23");
       aluno.put("Profissão", "Técnico de Suporte n.1");
       aluno.put("Curso", "ADS");
       
       Map<String, String> aluno2 = new HashMap<>();
       
       aluno2.put("Nome", "Alisson Augusto");
       aluno2.put("Idade", "25");
       aluno2.put("Profissão", "Advogado");
       aluno2.put("Curso", "Direito");
       
      
        
        List<Map<String, String>> listAlunos = new ArrayList<>();
        
        listAlunos.add(aluno);
        listAlunos.add(aluno2);
        
        
        for(Map<String, String> i : listAlunos){
            
            System.out.println(i.values().toString());
        }
       

       
        
    }
}
