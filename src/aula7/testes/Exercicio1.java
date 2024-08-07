package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.Desafio;
import aula5.stream.Pessoa;

class Exercicio1 {

	List<Pessoa> pessoas;

	@BeforeEach
	void setup() {
		pessoas = new ArrayList<>();
	}

	@DisplayName("Se a lista de Pessoas estiver vazia deve retornar uma lista vazia de Strings")
	@Test
	void deveRetornarUmaListaVazia() {
		assertTrue(Desafio.coletarPessoas(pessoas).isEmpty());
	}

	@DisplayName("Se a lista de Pessoas conter elementos deve retornar uma lista com os nomes das pessoas que começarem com vogal ou que nasceu em ano bissexto")
	@Test
	void deveRetornarPessoasFiltradas() {
		pessoas.add(new Pessoa("Guilherme", "(48) 91111-1111", LocalDate.of(2003, 12, 25)));
		pessoas.add(new Pessoa("Paulo", "(48) 91111-1111", LocalDate.of(2004, 12, 25)));
		pessoas.add(new Pessoa("Antonio", "(48) 91111-1111", LocalDate.of(2005, 12, 25)));

		List<String> listaNomes = Desafio.coletarPessoas(pessoas);

		assertEquals(2, listaNomes.size());
		assertTrue(listaNomes.contains("Paulo"));
		assertTrue(listaNomes.contains("Antonio"));
	}
}
