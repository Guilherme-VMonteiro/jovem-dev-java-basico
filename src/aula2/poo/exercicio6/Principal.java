package aula2.poo.exercicio6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {

		Pessoa pessoaSimples = new Pessoa();
		pessoaSimples.nome = "Maria";
		pessoaSimples.dataDeNascimento = LocalDate.of(2005, 11, 07);

		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.nome = "Guilherme";
		pessoaFisica.dataDeNascimento = LocalDate.of(2004, 12, 25);
		pessoaFisica.cpf = "11111999999";

		imprimirMaisNovo(pessoaSimples, pessoaFisica);
	}

	static void imprimirMaisNovo(Pessoa pessoaSimples, PessoaFisica pessoaFisica) {

		if (pessoaSimples.dataDeNascimento.isEqual(pessoaFisica.dataDeNascimento)) {
			System.out.println(pessoaSimples.nome + " e " + pessoaFisica.nome
					+ " possuem a mesma data de nascimento, e seus dados são:\n\n" + "Nome: " + pessoaSimples.nome
					+ " - Data de nascimento: "
					+ pessoaSimples.dataDeNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\nNome: "
					+ pessoaFisica.nome + " - Data de nascimento: "
					+ pessoaFisica.dataDeNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - CPF: "
					+ pessoaFisica.cpf);

		}

		if (pessoaSimples.dataDeNascimento.isAfter(pessoaFisica.dataDeNascimento)) {
			System.out.println("Nome: " + pessoaSimples.nome + " - Data de nascimento: "
					+ pessoaSimples.dataDeNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		} else {
			System.out.println("Nome: " + pessoaFisica.nome + " - Data de nascimento: "
					+ pessoaFisica.dataDeNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - CPF: "
					+ pessoaFisica.cpf);
		}
	}
}
