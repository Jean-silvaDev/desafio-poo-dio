package br.com.dio.desafio.dominio;

public class Curso {
	private String titulo, descricao;
	private int cargaHorario;
	
	public Curso() {}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargaHorario=" + cargaHorario + "]";
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaHorario() {
		return cargaHorario;
	}
	public void setCargaHorario(int cargaHorario) {
		this.cargaHorario = cargaHorario;
	}
}
