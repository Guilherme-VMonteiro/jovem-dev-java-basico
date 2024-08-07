package aula7.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Exercicio3 {

	static List<Integer> listaNormal;
	static List<Integer> listaComNulos;
	static List<Integer> listaVazia;

	@BeforeAll
	static void init() {
		listaNormal = new ArrayList<>();
		listaNormal.add(1);
		listaNormal.add(25);
		listaNormal.add(25);
		listaNormal.add(60);
		listaNormal.add(100);

		listaComNulos = new ArrayList<>();
		listaComNulos.add(null);
		listaComNulos.add(25);
		listaComNulos.add(null);
		listaComNulos.add(60);
		listaComNulos.add(100);

		listaVazia = new ArrayList<>();
	}

	@DisplayName("Se houver uma lista apenas com numeros deve retornar a soma de todos")
	@Test
	void deveRetornarASomaDosNumerosDeUmaListaNormal() {
		assertEquals(211, OperacaoListas.somarTodos(listaNormal));
	}

	@DisplayName("Se houver uma lista com numeros e objetos nulos deve retornar a soma de todos os numeros")
	@Test
	void deveRetornarASomaDosNumerosDeUmaListaComNulos() {
		assertEquals(185, OperacaoListas.somarTodos(listaComNulos));
	}

	@DisplayName("Se houver uma lista vazia deve retornar 0 para soma de todos os numeros")
	@Test
	void deveRetornarZeroParaSomaDeUmaListaVazia() {
		assertEquals(0, OperacaoListas.somarTodos(listaVazia));
	}

	@DisplayName("Se houver uma lista apenas com numeros deve retornar a media de todos os numeros maiores que 50")
	@Test
	void deveRetornarAMediaDosNumerosMaioresQueCinquentaDeUmaListaNormal() {
		assertEquals(80, OperacaoListas.calcularMediaDosMaiores(listaNormal));
	}

	@DisplayName("Se houver uma lista com numeros e objetos nulos deve retornar a media de todos os numeros maiores que 50")
	@Test
	void deveRetornarAMediaDosNumerosMaioresQueCinquentaDeUmaListaComElementosNulos() {
		assertEquals(80, OperacaoListas.calcularMediaDosMaiores(listaComNulos));
	}

	@DisplayName("Se houver uma lista vazia deve retornar 0")
	@Test
	void deveRetornarNadaDeUmaListaVazia() {
		assertEquals(0, OperacaoListas.calcularMediaDosMaiores(listaVazia));
	}

	@DisplayName("Se houver uma lista apenas com numeros deve retornar a quantidade de numeros 25")
	@Test
	void deveRetornarQuantidadeDeNumerosVinteECincoDeUmaListaNormal() {
		assertEquals(2, OperacaoListas.coletarQuantidadeDeNumerosVinteECinco(listaNormal));
	}
	
	@DisplayName("Se houver uma lista com numeros e objetos nulos deve retornar a quantidade de numeros 25")
	@Test
	void deveRetornarQuantidadeDeNumerosVinteECincoDeUmaListaComNulos() {
		assertEquals(1, OperacaoListas.coletarQuantidadeDeNumerosVinteECinco(listaComNulos));
	}

	@DisplayName("Se houver uma lista vazia deve retornar 0")
	@Test
	void deveRetornarZeroDaQuantidadeDeNumerosVinteECincoDeUmaListaVazia() {
		assertEquals(0, OperacaoListas.coletarQuantidadeDeNumerosVinteECinco(listaVazia));
	}
}
