package aula4.lambda.exemplos.interfacesFuncionais;

import java.util.ArrayList;
import java.util.List;

public class ExemploPredicate {

	public static void main(String[] args) {

		List<String> alunos = new ArrayList<String>();
		alunos.add("João");
		alunos.add("Maria");
		alunos.add("Paulo");
		alunos.add("Marcos");
		alunos.add("Isadora");

		// removeIf recebe uma interface funcional Predicate
		// Predicate recebe um argumento e retorna True ou False
		alunos.removeIf(nome -> nome.contains("u"));
		
		alunos.forEach(nome -> System.out.println(nome));
	}

}
