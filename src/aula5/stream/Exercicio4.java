package aula5.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio4 {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		gerarPessoas(pessoas);

		pessoas.stream().filter(pessoa -> pessoa.getDataNascimento().getMonthValue() == 5)
				.sorted((o1, o2) -> o1.getNome().compareTo(o2.getNome())).forEach(System.out::println);
		
	}

	static void gerarPessoas(List<Pessoa> lista) {
		Random gerador = new Random();
		lista.add(new Pessoa("Guilherme", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Pedro", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Maria", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("João", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Matheus", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Marcos", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Vinicius", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Antoniela", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Paulo", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Miguel", gerarTelefone(gerador), gerarNascimento(gerador)));
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
