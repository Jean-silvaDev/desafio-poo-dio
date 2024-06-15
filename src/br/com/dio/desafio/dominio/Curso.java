package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	private int cargaHorario;
	
	public Curso() {}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", cargaHorario=" + cargaHorario + "]";
	}

	public int getCargaHorario() {
		return cargaHorario;
	}
	public void setCargaHorario(int cargaHorario) {
		this.cargaHorario = cargaHorario;
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO * this.cargaHorario;
	}
}
