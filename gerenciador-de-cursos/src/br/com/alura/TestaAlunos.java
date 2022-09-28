package br.com.alura;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Lucas Rodrigues");
		alunos.add("Paulo Silveira");
		alunos.add("Nico Steppat");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");

		System.out.println(pauloEstaMatriculado);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos);
	}

}
