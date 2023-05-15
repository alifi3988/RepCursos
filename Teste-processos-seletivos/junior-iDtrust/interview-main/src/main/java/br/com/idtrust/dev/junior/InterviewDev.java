package br.com.idtrust.dev.junior;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class InterviewDev {

    private static final Set<Recebivel> RECEBIVEIS;

    public static void main(String[] args) throws Exception {

    	 System.out.println("Faça os exercícios abaixo usando os dados pré-criados na variável `RECEBIVEIS`.");
         System.out.println("Peço que prepare a resolução logo abaixo de cada enunciado.");
         System.out.println("");

         System.out.println("1 - Print a soma agrupando as mesmas datas de vencimentos");
         System.out.println("2 - Print a soma dos recebiveis ja vencidos");
         System.out.println("3 - Formate para moeda Real o valor do recebivel com vencimento 25/07/2023");
         System.out
                 .println("4 - Print o prazo em dias entre emissao e vencimento do recebivel com vencimento 12/10/2023");
         System.out.println("5 - Print a concatenação de todos os campos do recebivel separando por ;");
         System.out.println("6 - Formate a data 2023-06-25 do recebivel para o formato dd/MM/yyyy");
         System.out.println("");
         System.out.println("Exercício extra:");
         System.out.println(
                 "7 - Dado uma lista da variável `valores` abaixo, acrescente um novo valor de acordo com as regras a seguir:");
         System.out.println("    -  R$5,90 para valores menor e igual que R$100,00");
         System.out.println("    -  R$15,00 para valores menor que R$20,00");
         System.out.println("    -  R$4,33 para valores maior que R$100,00");
         System.out.println("    -  R$2,10 para valores maior que R$200,00");
         System.out.println("    -  R$3,55 para valores igual que R$150,00");
         System.out.println(
                 "    Print o novo resultado na saída da condição de validação e no final print a soma de todos os novos valores da lista");
         List<BigDecimal> valores = Arrays.asList(new BigDecimal("88.88"), new BigDecimal("17.01"),
                 new BigDecimal("20.00"), new BigDecimal("150.00"), new BigDecimal("124.21"), new BigDecimal("247.09"),
                 new BigDecimal("100.00"), new BigDecimal("4.99"));

         System.out.println("Boa Sorte!");
    }

    
    
    //add os valores no SET Recebivel
    static {
        Set<Recebivel> rs = new HashSet<>();
        rs.add(Recebivel.create("1H01R6HA1", LocalDate.parse("2023-05-02"), LocalDate.parse("2023-08-09"),
                new BigDecimal("146.99")));
        rs.add(Recebivel.create("1H01R6HB1", LocalDate.parse("2023-05-02"), LocalDate.parse("2023-05-08"),
                new BigDecimal("592.18")));
        rs.add(Recebivel.create("1H01R6HC1", LocalDate.parse("2023-05-03"), LocalDate.parse("2023-06-28"),
                new BigDecimal("98.20")));
        rs.add(Recebivel.create("1H01R6HD1", LocalDate.parse("2023-05-06"), LocalDate.parse("2023-09-19"),
                new BigDecimal("726.01")));
        rs.add(Recebivel.create("1H01R6HE1", LocalDate.parse("2023-05-02"), LocalDate.parse("2023-05-08"),
                new BigDecimal("81.88")));
        rs.add(Recebivel.create("1H01R6HF1", LocalDate.parse("2023-05-03"), LocalDate.parse("2023-07-15"),
                new BigDecimal("221.34")));
        rs.add(Recebivel.create("1H01R6HG1", LocalDate.parse("2023-05-02"), LocalDate.parse("2023-07-25"),
                new BigDecimal("711.98")));
        rs.add(Recebivel.create("1H01R6HH1", LocalDate.parse("2023-05-05"), LocalDate.parse("2023-10-10"),
                new BigDecimal("100.27")));
        rs.add(Recebivel.create("1H01R6HI1", LocalDate.parse("2023-05-02"), LocalDate.parse("2023-10-12"),
                new BigDecimal("3021.83")));
        rs.add(Recebivel.create("1H01R6HJ1", LocalDate.parse("2023-05-03"), LocalDate.parse("2023-09-19"),
                new BigDecimal("1930.76")));

        RECEBIVEIS = Collections.unmodifiableSet(rs);
    }

    //criação da classe recebivel
    public static class Recebivel {
    	
        public static Recebivel create(String codigo, LocalDate dataEmissao, LocalDate dataVencimento,
                BigDecimal valor) {
            Recebivel r = new Recebivel();
            r.codigo = codigo;
            r.dataEmissao = dataEmissao;
            r.dataVencimento = dataVencimento;
            r.valor = valor;
            return r;
        }

        private String codigo;
        private LocalDate dataEmissao;
        private LocalDate dataVencimento;
        private BigDecimal valor;
        
        
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public LocalDate getDataEmissao() {
			return dataEmissao;
		}
		public void setDataEmissao(LocalDate dataEmissao) {
			this.dataEmissao = dataEmissao;
		}
		public LocalDate getDataVencimento() {
			return dataVencimento;
		}
		public void setDataVencimento(LocalDate dataVencimento) {
			this.dataVencimento = dataVencimento;
		}
		public BigDecimal getValor() {
			return valor;
		}
		public void setValor(BigDecimal valor) {
			this.valor = valor;
		}
		@Override
		public String toString() {
			return codigo + ";" + dataEmissao + ";" + dataVencimento + ";" + valor;
		}
		@Override
		public int hashCode() {
			return Objects.hash(dataVencimento);
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Recebivel other = (Recebivel) obj;
			return Objects.equals(dataVencimento, other.dataVencimento);
		}
		
		///criando os métodos de comparação
		
		
		
		

    }

}
