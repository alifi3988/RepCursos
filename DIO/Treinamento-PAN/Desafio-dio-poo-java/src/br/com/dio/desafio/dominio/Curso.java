package br.com.dio.desafio.dominio;


public class Curso extends Conteudo{

    private int     cargaHoraria;
    
    public Curso() {
		// TODO Auto-generated constructor stub
	}

    public Curso(String titulo, String desc, int cargaHoraria) {
		super();
		this.cargaHoraria = cargaHoraria;
		setTitulo(titulo);
		setDescricao(desc);
	}

	public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}

    

    



    

    
}
