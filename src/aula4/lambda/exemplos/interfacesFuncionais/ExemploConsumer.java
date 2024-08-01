package aula4.lambda.exemplos.interfacesFuncionais;

import java.util.ArrayList;
import java.util.List;

public class ExemploConsumer {

	public static void main(String[] args) {

		List<String> alunos = new ArrayList<String>();
		alunos.add("João");
		alunos.add("Maria");
		alunos.add("Paulo");
		alunos.add("Marcos");
		alunos.add("Isadora");

		// forEach recebe uma interface funcional Consumer
		// Consumer consome um dado e não retorna nada
		alunos.forEach(nome -> System.out.println(nome));

	}

}
