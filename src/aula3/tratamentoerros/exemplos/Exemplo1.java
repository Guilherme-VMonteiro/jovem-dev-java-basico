package aula3.tratamentoerros.exemplos;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exemplos.exceptions.NotaInvalidaException;

public class Exemplo1 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Numero coletado: " + coletaNumero());
	}

	static double coletaNumero() {
		try {
			Double numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um número:"));
			
			if(numero > 10 || numero < 0) {
				throw new NotaInvalidaException("Nota inválida!");
			}
			
			return numero;
		} catch (IllegalArgumentException | NullPointerException e) {
			JOptionPane.showMessageDialog(null, "O valor digitado é inválido");
			return coletaNumero();
		}
	}
}
