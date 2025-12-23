package src;

import java.time.LocalDate;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso JAVA");
		curso1.setDescricao("descrição do curso");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso1.setTitulo("curso JS");
		curso1.setDescricao("descrição do curso");
		curso1.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria de JAVA");
		mentoria1.setDescricao("descrição da mentoria");
		mentoria1.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devRenan = new Dev();
		devRenan.setNome("Renan");
		devRenan.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devRenan.getConteudosInscritos());
		
		devRenan.progredir();
		System.out.println("-----");
		System.out.println("Conteúdos Inscritos" + devRenan.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos" + devRenan.getConteudosConcluidos());
		System.out.println("XP: "+ devRenan.calcularXp());

		System.out.println("======================================================");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-----");
		System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos" + devJoao.getConteudosConcluidos());
		System.out.println("XP: "+ devJoao.calcularXp());

	}

}
