package aula2.poo.exercicio4;

public class Principal {

	public static void main(String[] args) {

		Carro primeiroCarro = new Carro();
		primeiroCarro.modelo = "Nissan Sentra";
		primeiroCarro.ano = 2020;
		primeiroCarro.cor = "Branco";

		Carro segundoCarro = new Carro();
		segundoCarro.modelo = "Nissan Kicks";
		segundoCarro.ano = 2021;
		segundoCarro.cor = "Preto";

		Carro terceiroCarro = new Carro();
		terceiroCarro.modelo = "Nissan March";
		terceiroCarro.ano = 2018;
		terceiroCarro.cor = "Vermelho";

		System.out.println(
				"Modelo: " + primeiroCarro.modelo + " - Ano: " + primeiroCarro.ano + " - Cor: " + primeiroCarro.cor);
		System.out.println(
				"Modelo: " + segundoCarro.modelo + " - Ano: " + segundoCarro.ano + " - Cor: " + segundoCarro.cor);
		System.out.println(
				"Modelo: " + terceiroCarro.modelo + " - Ano: " + terceiroCarro.ano + " - Cor: " + terceiroCarro.cor);
	}

}
