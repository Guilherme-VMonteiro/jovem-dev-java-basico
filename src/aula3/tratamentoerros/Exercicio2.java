package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.ZeroException;

public class Exercicio2 {

	public static void main(String[] args) {

		int dividendo = coletaNumero();
		int divisor = coletaNumero();

		try {
			if (divisor == 0) {
				throw new ZeroException("ERRO: O divisor deve ser diferente de zero!");
			}

			JOptionPane.showMessageDialog(null, "Resultado da divisão: " + dividendo / divisor);
		} catch (ZeroException e) {
			JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
		}

	}

	static int coletaNumero() {
		try {
			return Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro:"));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Você digitou um valor inválido, tente novamente!");
			return coletaNumero();
		}
	}
}
