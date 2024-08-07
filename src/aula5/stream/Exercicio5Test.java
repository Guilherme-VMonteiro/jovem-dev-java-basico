package aula5.stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Exercicio5Test {

	List<String> pessoas;

	@BeforeEach
	void setup() {
		pessoas = new ArrayList<>();
	}

	@DisplayName("Se houver mais de um nome terminado em berto, deve retornar o primeiro")
	@Test
	void deveRetornarPrimeiroNomeTerminadoEmBerto() {
		pessoas.add("Guilherme");
		pessoas.add("Adalberto");
		pessoas.add("Giberto");

		String retorno = Exercicio5.buscaPrimeiroNomeTerminadoEmBerto(pessoas);

		assertEquals("Adalberto", retorno);
	}

	@DisplayName("Se a lista estiver vazia deve disparar ZeroBertoException")
	@Test
	void deveDispararExcessaoSeListaVazia() {

		assertThrows(ZeroBertoException.class, () -> Exercicio5.buscaPrimeiroNomeTerminadoEmBerto(pessoas));
	}

	@DisplayName("Se houver um elemento nulo e houver um berto, deve retornar o berto")
	@Test
	void deveTrazerNomeMesmoComElementoNulo() {
		pessoas.add("Guilherme");
		pessoas.add(null);
		pessoas.add("Giberto");

		String retorno = Exercicio5.buscaPrimeiroNomeTerminadoEmBerto(pessoas);

		assertEquals("Giberto", retorno);
	}

	@DisplayName("Se não houver berto na lista deve disparar ZeroBertoException")
	@Test
	void deveDispararExcessaoSeNaoHouverBerto() {
		pessoas.add("Guilherme");
		pessoas.add("Pedro");
		pessoas.add("Antonio");

		assertThrows(ZeroBertoException.class, () -> Exercicio5.buscaPrimeiroNomeTerminadoEmBerto(pessoas));
	}

}
