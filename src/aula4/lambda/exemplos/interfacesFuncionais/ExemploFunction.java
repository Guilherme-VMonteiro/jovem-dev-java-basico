package aula4.lambda.exemplos.interfacesFuncionais;

import java.util.ArrayList;
import java.util.List;

public class ExemploFunction {

	public static void main(String[] args) {

		List<String> alunos = new ArrayList<String>();
		alunos.add("Guilherme");
		alunos.add("Maria");
		alunos.add("João");
		alunos.add("Miguel");

		// Function recebe um argumento T e retorna um resultado R
		alunos
			.stream()
			.map(aluno -> aluno.length()) // Function String -> Integer
			.forEach(System.out::println);
	}
}
