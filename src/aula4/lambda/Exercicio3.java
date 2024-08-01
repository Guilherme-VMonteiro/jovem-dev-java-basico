package aula4.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(12, "Tulio", LocalDate.of(2003, 8, 12)));
		alunos.add(new Aluno(31, "Maria", LocalDate.of(2004, 1, 22)));
		alunos.add(new Aluno(1, "Tacio", LocalDate.of(2005, 2, 27)));
		alunos.add(new Aluno(7, "Laís", LocalDate.of(2006, 4, 9)));
		alunos.add(new Aluno(15, "Tancredo", LocalDate.of(2007, 9, 2)));

		alunos.removeIf(aluno -> aluno.nome.startsWith("T") && aluno.nome.endsWith("o"));

		alunos.forEach(System.out::println);
	}

}
