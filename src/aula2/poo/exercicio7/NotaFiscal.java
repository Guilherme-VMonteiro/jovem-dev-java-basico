package aula2.poo.exercicio7;

public class NotaFiscal {

	String emitente;
	private double valor = 0;

	void calculaValor(double preco, int desconto) {
		valor += preco * (1 - desconto / (double) 100);
	}
	
	//Adicionei o getValor para conferir se a logica esta correta!
	double getValor() {
		return valor;
	}
}
