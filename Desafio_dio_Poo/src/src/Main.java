package src;

import java.time.LocalDate;

import br.com.dio.desafio.Curso;
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
		
		Mentoria mentoria1 = new Mentoria(null, null, null);
		mentoria1.setTitulo("mentoria de JAVA");
		mentoria1.setDescricao("descrição da mentoria");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
	}

}
