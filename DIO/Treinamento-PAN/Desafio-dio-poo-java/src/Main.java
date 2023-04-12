import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main{
	
	//criação de menu, e trabalhando com o console
	public static int criacaoMenu() {
		
		Scanner scn = new Scanner(System.in);
		int entrada;
		int teste;
		limparConsole();
		System.out.println("=============================================================");
		System.out.println("* * * MENU * * * ");
		System.out.println("Informe conforme o desejado");
		System.out.println(""
				+ "\n[1] - Realizar o cadastro de Curso"
				+ "\n[2] - Realizar o cadastro de Mentoria"
				+ "\n[3] - Realizar o cadastro de Bootcamp"
				+ "\n[4] - Realizar o cadastro de DEV"
				+ "\n[5] - Verificar os Cursos"
				+ "\n[6] - Verificar as Mentorias"
				+ "\n[7] - Verificar os Bootcamps"
				+ "\n[8] - Verificar os DEVs"
				+ "\n[9] - Vincular Curso/Mentoria/DEV/Bootcamp"
				+ "\n[0] - Sair");
		
		System.out.print("Resposta: ");
		
		while(true) {
			try {
				entrada = scn.nextInt();
				break;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro no valor informado. Tente novamente! \n Erro: " + e.getMessage());
			}
		}
		
		return entrada;

	}
	
	public static void limparConsole() {
		
		///esse método ainda não está definido 100%, precisa verificar como limpa o consolo da IDE
		try {
			//realizando a limpeza do console
	        if (System.getProperty("os.name").contains("Windows")) {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	            
	        }
	        else {
	            Runtime.getRuntime().exec("clear");
	        }
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		}
	}
	
	
	//métodos para realizar os cadastros
	public static Curso realizarCadastroCurso() {
		
		//declaração das variaveis
		Scanner scn = new Scanner(System.in);
		
		//realizando impressão e entrada de dados
		System.out.println("=============================================================");
		System.out.println(" * * * REALIZAR CADASTRO CURSO * * *");
		System.out.println("Informe de acordo com o solicitado");
		
		System.out.print("Nome do Curso: ");
		String nome = scn.nextLine();
		
		System.err.println("Descrição do Curso: ");
		String desc = scn.nextLine();
		
		System.out.println("Carga horária: ");
		int cargaHoraria = scn.nextInt();
		System.out.println("=============================================================");
		
		return new Curso(nome, desc, cargaHoraria);
	}
	
	public static Mentoria realizarCadastroMentoria() {
		
		//declaração das variaveis
		Scanner scn = new Scanner(System.in);
		
		//realizando impressão e entrada de dados
		System.out.println("=============================================================");
		System.out.println(" * * * REALIZAR CADASTRO MENTORIA * * *");
		System.out.println("Informe de acordo com o solicitado");
		
		System.out.print("Nome da Mentoria: ");
		String nome = scn.nextLine();
		
		System.err.println("Descrição da Mentoria: ");
		String desc = scn.nextLine();
		
		System.out.println("Data de criação: ");
		LocalDate data = LocalDate.now();
		System.out.print(data);
		
		System.out.println("=============================================================");
		return new Mentoria(nome, desc, data);
	}
	
	public static Bootcamp realizarCadastroBootcamp() {
		
		//declaração das variaveis
		Scanner scn = new Scanner(System.in);
		
		//realizando impressão e entrada de dados
		System.out.println("=============================================================");
		System.out.println(" * * * REALIZAR CADASTRO BOOTCAMP * * *");
		System.out.println("Informe de acordo com o solicitado");
		
		System.out.print("Nome do Bootcamp: ");
		String nome = scn.nextLine();
		
		System.err.println("Descrição do Bootcamp: ");
		String desc = scn.nextLine();

		System.out.println("=============================================================");
		return new Bootcamp(nome, desc);
	}
	
	public static Dev realizarCadastroDev() {
		
		//declaração das variaveis
		Scanner scn = new Scanner(System.in);
		
		//realizando impressão e entrada de dados
		System.out.println("=============================================================");
		System.out.println(" * * * REALIZAR CADASTRO DEV * * *");
		System.out.println("Informe de acordo com o solicitado");
		
		System.out.print("Nome do DEV: ");
		String nome = scn.nextLine();

		System.out.println("=============================================================");
		
		return new Dev(nome);
	}
	
	
	//método para realizar a impressão no console
	public static void vizualizarCursos(Map<Integer, Curso> map) {
		
		System.out.println("=============================================================");
		System.out.println(" * * * REALIZAR IMPRESSÃO CURSO * * * ");
		for(Map.Entry<Integer, Curso> c: map.entrySet()) {
			System.out.println("----------------------------------------------------------");
			System.out.println(c.getKey() + "º Curso");
			System.out.println(c.getValue());
			System.out.println("----------------------------------------------------------");

		}
		
	}
	
	public static Boolean desejaContinuar(){
		while(true) {
			try {
				
				System.out.println("Deseja continuar? ");
				System.out.print("[S/s - sim ou N/n - não]");
				System.out.println("Resposta: ");
				String resp = new Scanner(System.in).nextLine().toUpperCase();
				if(resp == "N")
					return false;
				else {
					return true;
				}
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage() + "\nTente novamente!");
				
			}
		}
	}
	
	
	public static void vizualizarMentoria(Map<Integer, Mentoria> map) {
		
		System.out.println("=============================================================");
		System.out.println(" * * * REALIZAR IMPRESSÃO MENTORIA * * * ");
		for(Map.Entry<Integer, Mentoria> c: map.entrySet()) {
			System.out.println("----------------------------------------------------------");
			System.out.println(c.getKey() + "º Mentoria");
			System.out.println(c.getValue());
			System.out.println("----------------------------------------------------------");

		}
		
	}
	
	public static void vizualizarBootcamp(Map<Integer, Bootcamp> map) {
		
		System.out.println("=============================================================");
		System.out.println(" * * * REALIZAR IMPRESSÃO BOOTCAMP * * * ");
		for(Map.Entry<Integer, Bootcamp> c: map.entrySet()) {
			System.out.println("----------------------------------------------------------");
			System.out.println(c.getKey() + "º Bootcamp");
			System.out.println(c.getValue());
			System.out.println("----------------------------------------------------------");

		}
		
	}
	
	public static void vizualizarDev(Map<Integer, Dev> map) {
		
		System.out.println("=============================================================");
		System.out.println(" * * * REALIZAR IMPRESSÃO DEV * * * ");
		for(Map.Entry<Integer, Dev> c: map.entrySet()) {
			System.out.println("----------------------------------------------------------");
			System.out.println(c.getKey() + "º DEV");
			System.out.println(c.getValue());
			System.out.println("----------------------------------------------------------");

		}
		
	}
	
	
	//métodos para realizar a vinculação um com o oytro
	public static int criacaoVinculacao() {
		
		Scanner scn = new Scanner(System.in);
		int entrada;
		
		limparConsole();
		System.out.println("=============================================================");
		System.out.println("* * * VINCULAR * * * ");
		System.out.println("Informe conforme o desejado");
		System.out.println(""
				+ "\n[1] - Vincular Curso ao Bootcamp"
				+ "\n[2] - Vincular Mentoria ao Bootcamp"
				+ "\n[3] - Vincular DEV ao Bootcamp"
				+ "\n[4] - vzio"
				+ "\n[0] - Voltar ao Menu");
		
		System.out.print("Resposta: ");
		
		while(true) {
			try {
				entrada = scn.nextInt();
				break;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro no valor informado. Tente novamente! \n Erro: " + e.getMessage());
			}
		}
		
		return entrada;

	}

	public static Set<Dev> vincularDev(Set<Dev> set){
		
		if(set.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Passou um objeto vazio ou inexistente!");
			return null;
		}
		
		
		
		
		
		return set;
		
	}

	
	
	//principal
    public static void main(String[] args) {
    	
    	//criação dos maps para realizar o armazenamento
    	Map<Integer, Curso> mapCurso = new LinkedHashMap<>();
    	Map<Integer, Mentoria> mapMentoria = new LinkedHashMap<>();
    	Map<Integer, Bootcamp> mapBootcamp = new LinkedHashMap<>();
    	Map<Integer, Dev> mapDev = new LinkedHashMap<>();
    	int controleCurso = 0, controleMentoria = 0, controleBoot = 0, controleDev = 0;
    	Scanner scn = new Scanner(System.in);
    	
    	while(true) {
	    	int entrada = criacaoMenu();
				switch (entrada) {
				case 1:
					//cadastro de curso
					limparConsole();
					controleCurso++;
					mapCurso.put(controleCurso, realizarCadastroCurso());
					break;
				case 2:
					//cadastro de mentoria
					limparConsole();
					controleMentoria++;
					mapMentoria.put(controleMentoria, realizarCadastroMentoria());
					break;
				case 3:
					//cadastro de bootcamp
					limparConsole();
					controleBoot++;
					mapBootcamp.put(controleBoot, realizarCadastroBootcamp());
					break;
				case 4:
					//cadastro de DEV
					limparConsole();
					controleDev++;
					mapDev.put(controleDev, realizarCadastroDev());
					break;
				case 5:
					//verificar Curso
					limparConsole();
					vizualizarCursos(mapCurso);
					break;
				case 6:
					//verificar Mentoria
					limparConsole();
					vizualizarMentoria(mapMentoria);
					break;
				case 7:
					//verificar Bootcamp
					limparConsole();
					vizualizarBootcamp(mapBootcamp);
					break;
				case 8:
					//verificar Dev
					limparConsole();
					vizualizarDev(mapDev);
					break;
				case 9:
					//vincular
					limparConsole();
					entrada = criacaoVinculacao();
					switch (entrada) {
					case 1:
						//vincular Curso ao Bootcamp
						limparConsole();
						System.out.println("=========================================");
						System.out.println(" * * * VINCULANDO CURSO AO BOOTCAMP * * *");
						System.out.println("=========================================");
						while(true) {
							try {
								System.out.print("Informe o código do Bootcamp: ");
								int codBoot = scn.nextInt(); //entrada do 
								
								if(!mapBootcamp.containsKey(codBoot)) {
									JOptionPane.showMessageDialog(null, "Código informado não condiz com nenhum registro.");
								}
								System.out.println("Bootcamp localizado. Infome agora Código do curso que será add.");
								System.out.println("Nome do Bootcamp Localizado: " + mapBootcamp.get(codBoot).getNome());
								System.out.println("======================================================================");
								while(true) {
									System.out.print("Código do Curso: ");
									int codCurso = scn.nextInt();
									
									if(mapCurso.containsKey(codCurso)) {
										System.out.println("Curso localizado. Adicionando....");
										mapBootcamp.get(codBoot).getConteudos().add(mapCurso.get(codCurso));
									}
									
									if(!desejaContinuar()) {
										break;
									}
	
								}
								System.out.println("======================================================================");
								break;
								
							}catch (Exception e) {
								JOptionPane.showMessageDialog(null, "Erro no valor informado. Tente novamente!");
							}
						} //finalização case 1
						
						
					case 2:
						//vincular Curso ao Bootcamp
						limparConsole();
						System.out.println("============================================");
						System.out.println(" * * * VINCULANDO MENTORIA AO BOOTCAMP * * *");
						System.out.println("============================================");
						while(true) {
							try {
								System.out.print("Informe o código do Bootcamp: ");
								int codBoot = scn.nextInt(); //entrada do 
								
								if(!mapBootcamp.containsKey(codBoot)) {
									JOptionPane.showMessageDialog(null, "Código informado não condiz com nenhum registro.");
								}
								System.out.println("Bootcamp localizado. Infome agora Código do curso que será add.");
								System.out.println("Nome do Bootcamp Localizado: " + mapBootcamp.get(codBoot).getNome());
								System.out.println("======================================================================");
								while(true) {
									System.out.print("Código Mentoria: ");
									int codCurso = scn.nextInt();
									
									if(mapCurso.containsKey(codCurso)) {
										System.out.println("Mentoria localizado. Adicionando....");
										mapBootcamp.get(codBoot).getConteudos().add(mapMentoria.get(codCurso));
									}
									
									if(!desejaContinuar()) {
										break;
									}
	
								}
								System.out.println("======================================================================");
								break;
								
							}catch (Exception e) {
								JOptionPane.showMessageDialog(null, "Erro no valor informado. Tente novamente!");
							}
						} //finalização case 2
						
					case 3:
						//vincular Curso ao Bootcamp
						limparConsole();
						System.out.println("====================================");
						System.out.println(" * * * VINCULANDO DEV BOOTCAMP * * *");
						System.out.println("====================================");
						while(true) {
							try {
								System.out.print("Informe o código do Aluno: ");
								int codDev = scn.nextInt(); //entrada do 
								
								if(!mapDev.containsKey(codDev)) {
									JOptionPane.showMessageDialog(null, "Código informado não condiz com nenhum registro.");
								}
								System.out.println("DEV localizado. Infome agora Código do curso que será vinculado.");
								System.out.println("Nome do DEV Localizado: " + mapBootcamp.get(codDev).getNome());
								System.out.println("======================================================================");
								while(true) {
									System.out.print("Código do Bootcamp: ");
									int codBoot = scn.nextInt();
									
									if(mapCurso.containsKey(codBoot)) {
										System.out.println("Bootcamp localizado. Adicionando....");
										mapDev.get(codDev).inscreverBootcamp(mapBootcamp.get(codBoot));
									}
									
									if(!desejaContinuar()) {
										break;
									}
	
								}
								System.out.println("======================================================================");
								break;
								
							}catch (Exception e) {
								JOptionPane.showMessageDialog(null, "Erro no valor informado. Tente novamente!");
							}
						} //finalização case 3
					case 0:
						break;
						
					default:
						JOptionPane.showMessageDialog(null, "Valor informado não condiz com o solicitado. Tente novamente");
					}
					if(entrada == 0) {
						System.out.println(" * * * VOLTANDO AO MENU * * *");
						entrada = 1;
					}

				case 0:
					limparConsole();
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Valor informado não condiz com o solicitado. Tente novamente");
			}
				
			if(entrada == 0) {
				System.out.println(" * * * FINALIZANDO SISTEMA * * *");
				break;
			}	
    	}
    }
}