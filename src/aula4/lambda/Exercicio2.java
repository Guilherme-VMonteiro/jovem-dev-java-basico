package aula4.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(12, "Pedro", LocalDate.of(2003, 8, 12)));
		alunos.add(new Aluno(31, "Maria", LocalDate.of(2004, 1, 22)));
		alunos.add(new Aluno(1, "Antonio", LocalDate.of(2005, 2, 27)));
		alunos.add(new Aluno(7, "Laís", LocalDate.of(2006, 4, 9)));
		alunos.add(new Aluno(15, "Carlos", LocalDate.of(2007, 9, 2)));

		alunos.sort((a1, a2) -> a1.dataNascimento.isBefore(a2.dataNascimento) ? -1 : 1);

		alunos.forEach(System.out::println);
	}
}
