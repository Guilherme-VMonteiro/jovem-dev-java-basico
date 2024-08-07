package aula5.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercicio5 {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		gerarPessoas(pessoas);

		System.out.println(buscaPrimeiroNomeTerminadoEmBerto(coletaNomes(pessoas)));
	}

	static List<String> coletaNomes(List<Pessoa> pessoas) {
		return pessoas.stream().filter(Objects::nonNull).map(pessoa -> pessoa.getNome()).collect(Collectors.toList());
	}

	public static String buscaPrimeiroNomeTerminadoEmBerto(List<String> nomes) {
		return nomes.stream().filter(Objects::nonNull).filter(nome -> nome.endsWith("berto")).findFirst()
				.orElseThrow(() -> new ZeroBertoException());
	}

	static void gerarPessoas(List<Pessoa> lista) {

		Random gerador = new Random();

		lista.add(new Pessoa("Guilherme", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Adalberto", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Laís", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Pedro", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Carlos", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Maria", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Matheus", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("João", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Igor", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Antonio", gerarTelefone(gerador), gerarNascimento(gerador)));
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
