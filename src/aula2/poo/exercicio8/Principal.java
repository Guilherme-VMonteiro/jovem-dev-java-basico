package aula2.poo.exercicio8;

public class Principal {

	public static void main(String[] args) {

		Automovel carro = new Automovel();
		carro.nome = "Nissan Sentra";
		carro.cor = "Branco";
		carro.velocidade = 0;

		carro.acelerar();
	}
}
