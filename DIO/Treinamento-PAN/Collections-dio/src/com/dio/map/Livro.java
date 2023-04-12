package com.dio.map;

import java.util.Objects;

/**
 *
 * @author alifi
 */
public class Livro implements Comparable<Livro>{
    
    
    String  nome;
    String  autor;
    int     paginas;

    public Livro(String nome, String autor, int paginas) {
        this.nome = nome;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Livro() {
        this.nome = null;
        this.autor = null;
        this.paginas = 0;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", autor=" + autor + ", paginas=" + paginas + '}';
    }

    @Override
    public int compareTo(Livro o) {
        if(o == null) return -1;
        else if(this.equals(o)) return 0;
        else if(this.getPaginas()> o.getPaginas()) return 1;
        return 2;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.autor);
        hash = 23 * hash + this.paginas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (this.paginas != other.paginas) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }
    
   
    
    
    
    
}
