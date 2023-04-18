package one.digitalinnovation.gof.model;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/***
 * 
 * @author alifi
 *
 */

@Entity
public class Cliente {
	
	//ATRIBUTOS DA CLASSE CLIENTE
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //geração automática do ID
	private Long id;
	
	private String nome;
	
	@ManyToOne  //ManyToOne (Várias clientes um endereço, enquanto o endeço pode estar para várias pessoas)
	private Endereco endereco;

	
	//CONSTRUTORES
	public Cliente(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	
	
	
	//MÉTODOS GETS E SETS E OUTROS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	//OUTROS MÉTODOS 
	
	@Override
	public int hashCode() {
		return Objects.hash(endereco, id, nome);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(endereco, other.endereco) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome);
	}

	//TO STRING
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	
	
	
}
