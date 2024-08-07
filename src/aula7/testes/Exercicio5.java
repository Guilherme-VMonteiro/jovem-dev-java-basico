package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Exercicio5 {

	@Test
	void dadoUmNumeroDeveRetornarOCalculoDoRaioDaCircunferencia() {
		assertEquals(0, aula6.outros.Exercicio5.calculaRaioDaCircunferencia(0D).doubleValue());
		assertEquals(3.1416, aula6.outros.Exercicio5.calculaRaioDaCircunferencia(1D).doubleValue(), 0.0001);
		assertEquals(12.5664, aula6.outros.Exercicio5.calculaRaioDaCircunferencia(2D).doubleValue(), 0.0001);
	}
}
