package aula3.tratamentoerros;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		int numero = coletaNumero();

		JOptionPane.showMessageDialog(null, "Número inserido: " + numero);
	}

	static int coletaNumero() {

		try {
			return Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro:"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Você digitou um valor não reconhecido, tente novamente!");
			return coletaNumero();
		}
	}
}
