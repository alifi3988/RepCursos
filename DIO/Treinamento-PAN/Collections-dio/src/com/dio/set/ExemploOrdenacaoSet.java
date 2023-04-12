/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.set;
import java.util.Set;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;
/**
 *
 * @author alifi
 */
public class ExemploOrdenacaoSet {
    public static void main(String[] args){
	/*
        System.out.println("--\tEm ordem Aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
                add(new Serie("GOT", "Fantasia", 60));
                add(new Serie("DARK", "Drama", 60));
                add(new Serie("That '70s Show", "Comédia", 25));
        }};
        for(Serie s: minhasSeries){
                System.out.println(s.toString());
        }

        System.out.println("--\tEm ordem de inserção\t--");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
                add(new Serie("GOT", "Fantasia", 60));
                add(new Serie("DARK", "Drama", 60));
                add(new Serie("That '70s Show", "Comédia", 25));
        }};
            for(Serie s: minhasSeries2){
                    System.out.println(s.toString());
            }


            System.out.println("--\tEm ordem natural\t--");
            Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries);
            for(Serie s: minhasSeries3){
                    System.out.println(s.toString());
            }

            System.out.println("--\tEm ordem Nome/Genero/TempoEpisodio\t--");
            Set<Serie> minhasSeries3 = new TreeSet<>(ComparatoNameGeneroTempoepisodio());
            minhasSeries3.addAll(minhasSeries);
            for(Serie s: minhasSeries3){
                    System.out.println(s.toString());
            }		

    }


    class Serie implements Comparable<Serie>{

        private static String		nome;
        private static String		genero;
        private static Integer		tempoEpisodio;

        public Serie(String nome, String genero, Integer  tempoEpisodio) {
            Serie.nome = nome;
            Serie.genero = genero;
            Serie.tempoEpisodio = tempoEpisodio;
        }

            

        //métodos gets e sets

        public void setNome(String nome){
                Serie.nome = nome;
        }

        public void setGenero(String genero){
                Serie.genero = genero;
        }

        public void setTempoEpisodio(Integer tempoEpisodio){
                Serie.tempoEpisodio = tempoEpisodio;
        }


        public String getNome(){
                return Serie.nome;
        }

        public String getGenero(){
                return Serie.genero;
        }

        public Integer getTempoEpisodio(){
                return Serie.tempoEpisodio;
        }


        //ToString
        @Override
        public String toString(){
                return	"Série{" +
                        "nome = " + getNome() +
                        "genero =" + getGenero() + 
                        "tempoEpisodio=" + getTempoEpisodio() + " minutos" + 
                        "}";

        }

        //Métodos Equals
        @Override
        public boolean equals(Object o){
                if(this == o) return true;
                if(o == null || getClass() != o.getClass()) return false;
                Serie serie = (Serie) o;
                return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);

        }

        //Método HasCode
        @Override
        public int hashCode(){
                return Objects.hash(nome, genero, tempoEpisodio);
        }


        //Método Comparable
        public int compareTO(Serie serie){

                int tempoEpisodioCompare = serie.getTempoEpisodio();

                if(tempoEpisodioCompare != 0) 
                        return tempoEpisodioCompare;
                return this.getGenero().compareTo(serie.getGenero());
        }

        @Override
        public int compareTo(Serie o) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }


    class ComparatoNameGeneroTempoepisodio implements Comparable<Serie>{

        public int compare(Serie s1, Serie s2){
            int nome = s1.getNome().compareTo(s2.getNome());
            if(nome != 0) return nome;			

            int genero = s1.getGenero().compareTo(s2.getGenero());
            if(genero != 0) return genero;

            return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

        }

        @Override
        public int compareTo(Serie o) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
*/
    }
}
