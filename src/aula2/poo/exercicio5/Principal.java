package aula2.poo.exercicio5;

import java.time.LocalDate;
import java.time.Period;

public class Principal {

	public static void main(String[] args) {

		Pessoa primeiraPessoa = new Pessoa();
		primeiraPessoa.nome = "Guilherme";
		primeiraPessoa.dataDeNascimento = LocalDate.parse("2004-12-25");

		Pessoa segundaPessoa = new Pessoa();
		segundaPessoa.nome = "Pedro";
		segundaPessoa.dataDeNascimento = LocalDate.parse("2005-12-25");

		imprimirMaisVelho(primeiraPessoa, segundaPessoa);
	}

	static void imprimirMaisVelho(Pessoa primeiraPessoa, Pessoa segundaPessoa) {

		if (primeiraPessoa.dataDeNascimento.isEqual(segundaPessoa.dataDeNascimento)) {
			System.out.println(
					primeiraPessoa.nome + " e " + segundaPessoa.nome + " possuem a mesma data de nascimento e possuem "
							+ Period.between(segundaPessoa.dataDeNascimento, LocalDate.now()).getYears() + " anos.");
		}

		if (primeiraPessoa.dataDeNascimento.isBefore(segundaPessoa.dataDeNascimento)) {
			System.out.println(primeiraPessoa.nome + " é o mais velho, possuindo "
					+ Period.between(primeiraPessoa.dataDeNascimento, LocalDate.now()).getYears() + " anos.");
		} else {
			System.out.println(segundaPessoa.nome + " é o mais velho, possuindo "
					+ Period.between(segundaPessoa.dataDeNascimento, LocalDate.now()).getYears() + " anos.");
		}
	}
}
