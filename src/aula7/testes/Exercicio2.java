package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.Exercicio5;
import aula5.stream.ZeroBertoException;

class Exercicio2 {

	List<String> pessoas;

	@BeforeEach
	void setup() {
		pessoas = new ArrayList<>();
	}

	@DisplayName("Se a lista estiver vazia deve disparar ZeroBertoException")
	@Test
	void deveDispararExcessaoCasoListaVazia() {
		assertThrows(ZeroBertoException.class, () -> Exercicio5.buscaPrimeiroNomeTerminadoEmBerto(pessoas));
	}

	@DisplayName("Se houver apenas um nome terminado em berto, deve retornar ele")
	@Test
	void deveRetornarUnicoNomeTerminadoEmBerto() {
		pessoas.add("Guilherme");
		pessoas.add("Adalberto");
		pessoas.add("Carlos");

		assertEquals("Adalberto", Exercicio5.buscaPrimeiroNomeTerminadoEmBerto(pessoas));
	}

	@DisplayName("Se houver mais de um nome terminado em berto, deve retornar o primeiro")
	@Test
	void deveRetornarPrimeiroNomeTerminadoEmBerto() {
		pessoas.add("Guilherme");
		pessoas.add("Adalberto");
		pessoas.add("Giberto");

		assertEquals("Adalberto", Exercicio5.buscaPrimeiroNomeTerminadoEmBerto(pessoas));
	}

}
