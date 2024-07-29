package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {

		String palavraInserida = "";
		List<String> palavras = new ArrayList<String>();

		do {

			palavraInserida = JOptionPane.showInputDialog("Digite uma palavra:\n(Digite 'fim' para sair.)");

			if (!palavraInserida.isEmpty() && !palavraInserida.equalsIgnoreCase("fim")) {
				palavras.add(palavraInserida);
			}

		} while (!palavraInserida.equalsIgnoreCase("fim"));

		Map<Character, ArrayList<String>> mapaDePalavras = new HashMap<Character, ArrayList<String>>();
		String mensagemFinal = "Resultado final:\n";

		for (int i = 0; i < "aeiou".length(); i++) {
			char caractere = "aeiou".charAt(i);
			mensagemFinal += "\nLetra '" + caractere + "' - Palavras: ";
			mapaDePalavras.put(caractere, new ArrayList<String>());

			for (String palavra : palavras) {
				if (palavra.toLowerCase().indexOf(caractere) > -1) {
					mapaDePalavras.get(caractere).add(palavra);
				}
			}

			Collections.sort(mapaDePalavras.get(caractere));

			for (int j = 0; j < mapaDePalavras.get(caractere).size(); j++) {
				if (j != mapaDePalavras.get(caractere).size() - 1) {
					mensagemFinal += mapaDePalavras.get(caractere).get(j) + ", ";
				} else {
					mensagemFinal += mapaDePalavras.get(caractere).get(j);
				}
			}
		}

		JOptionPane.showMessageDialog(null, mensagemFinal);
	}

}
