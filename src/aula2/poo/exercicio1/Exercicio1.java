package aula2.poo.exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "O número inteiro é: " + (int) Double
				.parseDouble(JOptionPane.showInputDialog("Insira um número com virgula!").replace(',', '.')));
	}
}
