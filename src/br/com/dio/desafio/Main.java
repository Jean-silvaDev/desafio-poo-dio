package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHorario(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição curso Java Script");
		curso2.setCargaHorario(10);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descricao mentoria de java");
		mentoria.setData(LocalDate.now());
		
		/*Conteudo conteudo = new Curso();
		Conteudo conteudo2 = new Mentoria();
		
		System.out.println(curso1.toString().concat("\n" + curso2));
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev = new Dev(), dev2 = new Dev();
		dev.setNome("Dev 1"); dev2.setNome("Dev 2");
		dev.inscreverBootcamp(bootcamp); dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Dev 1: " + dev.getConteudosInscritos());
		System.out.println("Conteudos concluidos Dev 1: " + dev.getConteudosConcluidos());
		System.out.println("XP: " + dev.calcularXP());
		System.out.println("------------------------------");
		System.out.println("Conteudos inscritos Dev 2: " + dev2.getConteudosInscritos());
		System.out.println("Conteudos concluidos Dev 2: " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularXP());
		System.out.println("------------------------------");
		
		dev.progredir(); dev.progredir(); dev2.progredir();  dev2.progredir();  dev2.progredir();
		System.out.println("Conteudos inscritos Dev 1: " + dev.getConteudosInscritos());
		System.out.println("Conteudos concluidos Dev 1: " + dev.getConteudosConcluidos());
		System.out.println("XP: " + dev.calcularXP());
		System.out.println("------------------------------");
		System.out.println("Conteudos inscritos Dev 2: " + dev2.getConteudosInscritos());
		System.out.println("Conteudos concluidos Dev 2: " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularXP());
	}

}
