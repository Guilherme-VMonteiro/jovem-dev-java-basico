package aula2.poo.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {

		String primeiraFrase = JOptionPane.showInputDialog("Digite a primeira frase:");
		String segundaFrase = JOptionPane.showInputDialog("Digite a segunda frase:");

		if (primeiraFrase.equals(segundaFrase)) {
			System.out.println("A primeira frase é igual a segunda e ambas possuem "
					+ primeiraFrase.replaceAll(" ", "").length() + " caracteres!");
		}
	}
}
