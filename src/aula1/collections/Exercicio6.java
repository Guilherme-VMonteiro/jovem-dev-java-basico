package aula1.collections;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {

		int qtdAlunos = 5;
		int qtdProvas = 3;

		Map<String, Double[]> mapaDeNotas = new HashMap<>();

		String mensagemFinal = "Resultado da sala:\n\n";

		for (int i = 0; i < qtdAlunos; i++) {
			String aluno = JOptionPane.showInputDialog("Insira o nome do aluno " + (i + 1) + ":");
			Double[] notas = new Double[qtdProvas];

			mensagemFinal += "Aluno: " + aluno + " - Notas: ";

			for (int j = 0; j < qtdProvas; j++) {
				notas[j] = Double
						.parseDouble(JOptionPane.showInputDialog("Insira a nota " + (j + 1) + " de " + aluno + ":"));

				if (j != qtdProvas - 1) {
					mensagemFinal += notas[j] + ", ";
				} else {
					mensagemFinal += notas[j];
				}
			}

			mensagemFinal += " - Média: " + String.format("%.2f", calculaMedia(notas)) + "\n";
			mapaDeNotas.put(aluno, notas);
		}
		JOptionPane.showMessageDialog(null, mensagemFinal);
	}

	public static double calculaMedia(Double[] notas) {
		double media = 0;

		for (Double nota : notas) {
			media += nota;
		}

		return media / notas.length;
	}
}
