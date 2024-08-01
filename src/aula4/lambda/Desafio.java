package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<String>();
		nomes.add("Pedro");
		nomes.add("Marcos");
		nomes.add("Maria");
		nomes.add("Julia");
		nomes.add("Ana");

		Mostrador mostrador = valor -> System.out.println(valor.toUpperCase());

		nomes.forEach(mostrador::mostra);
	}
}
