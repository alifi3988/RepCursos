import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args)  throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		String AN1,AN2,AN3;
		
		AN1 = sc.nextLine();
		AN2 = sc.nextLine();
		AN3 = sc.nextLine();
		
		//Criação de dados
		Map<String,Animal> mapAnimal = new LinkedHashMap<>(){{
			put("aguia", new Animal("vertebrado","ave","carnivoro"));
			put("pomba", new Animal("vertebrado","ave","onivoro"));
			put("homem", new Animal("vertebrado","mamifero","onivoro"));
			put("vaca", new Animal("vertebrado","mamifero","herbivoro"));
			put("pulga", new Animal("invertebrado","inseto","hematofago"));
			put("lagarta", new Animal("invertebrado","inseto","herbivoro"));
			put("sanguessuga", new Animal("invertebrado","anelideo","hematofago"));
			put("minhoca", new Animal("invertebrado","anelideo","onivoro"));
		}};
		
		
		//criação do animal informado
		Animal animal = new Animal(AN1, AN2, AN3);
		
		//verificação e comparação
		System.out.println(mapAnimal);
		System.out.println(animal);
		
		Set<Map.Entry<String, Animal>> entries = mapAnimal.entrySet();
		
		//pegando a chave
		for(Map.Entry<String, Animal> entry : entries) {
			if(Objects.equals(entry.getValue(), animal)) {
				String saida = entry.getKey();
				System.out.println(saida);
			}
		}
		
		
		
		//TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
        	//Dica: Você pode utilizar o método equals para realizar comparações.
	}
}

class Animal{
	
	private String carVert;
	private String filo;
	private String alimentacao;
	
	//construtor
	public Animal(String carVert, String filo, String alimentacao) {
		super();
		this.carVert = carVert;
		this.filo = filo;
		this.alimentacao = alimentacao;
	}
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	
	//métodos
	public String getCarVert() {
		return carVert;
	}
	


	public void setCarVert(String carVert) {
		this.carVert = carVert;
	}
	
	public String getFilo() {
		return filo;
	}
	
	public void setFilo(String filo) {
		this.filo = filo;
	}
	
	public String getAlimentacao() {
		return alimentacao;
	}
	
	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alimentacao, carVert, filo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(alimentacao, other.alimentacao) && Objects.equals(carVert, other.carVert)
				&& Objects.equals(filo, other.filo);
	}

	@Override
	public String toString() {
		return "Animal [carVert=" + carVert + ", filo=" + filo + ", alimentacao=" + alimentacao + "]";
	}
}


