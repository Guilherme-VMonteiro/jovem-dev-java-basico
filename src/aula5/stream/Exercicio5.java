package aula5.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Exercicio5 {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		gerarPessoas(pessoas);

		Optional<Pessoa> pessoaBerto = pessoas.stream().filter(pessoa -> pessoa.getNome().endsWith("berto"))
				.findFirst();

		System.out.println(pessoaBerto.orElseThrow(() -> new ZeroBertoException()));

	}

	static void gerarPessoas(List<Pessoa> lista) {

		Random gerador = new Random();

		for (int i = 0; i < 10; i++) {

			lista.add(new Pessoa("Pessoa" + i + " " + gerarBerto(gerador), gerarTelefone(gerador),
					gerarNascimento(gerador)));
		}

	}

	static String gerarBerto(Random random) {
		return random.nextInt(101) > 90 ? "berto" : "";
	}

	static LocalDate gerarNascimento(Random random) {
		return LocalDate.of(random.nextInt((2024 - 1900) + 1) + 1900, random.nextInt(12) + 1, random.nextInt(28) + 1);
	}

	static String gerarTelefone(Random random) {
		return "(48) 9" + gerarNumeros(random) + "-" + gerarNumeros(random);
	}

	private static String gerarNumeros(Random random) {
		String retorno = "";

		for (int i = 0; i < 4; i++) {
			retorno += random.nextInt(10);
		}

		return retorno;
	}
}
