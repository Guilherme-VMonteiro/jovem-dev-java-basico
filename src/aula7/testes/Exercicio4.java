package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula6.outros.Calculadora2Enum;

class Exercicio4 {

	final int primeiroNumero = 4;
	final int segundoNumero = 2;

	@DisplayName("Se dado dois numeros inteiros, deve aprensentar a soma")
	@Test
	void deveSomarDoisInteiros() {
		assertEquals(6, Calculadora2Enum.SOMA.getCalculo().apply(primeiroNumero, segundoNumero));
	}

	@DisplayName("Se dado dois numeros inteiros, deve aprensentar a subtracao")
	@Test
	void deveSubtrairDoisInteiros() {
		assertEquals(2, Calculadora2Enum.SUBTRACAO.getCalculo().apply(primeiroNumero, segundoNumero));
	}

	@DisplayName("Se dado dois numeros inteiros, deve aprensentar a multiplicacao")
	@Test
	void deveMultiplicarDoisInteiros() {
		assertEquals(8, Calculadora2Enum.MULTIPLICACAO.getCalculo().apply(primeiroNumero, segundoNumero));
	}

	@DisplayName("Se dado dois numeros inteiros, deve aprensentar a divisao")
	@Test
	void deveDividirDoisInteiros() {
		assertEquals(2, Calculadora2Enum.DIVISAO.getCalculo().apply(primeiroNumero, segundoNumero));
	}

}
