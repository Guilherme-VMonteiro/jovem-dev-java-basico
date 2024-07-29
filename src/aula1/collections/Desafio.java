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

		for (int i = 0; i < "aeiou".length(); i++) {
			mapaDePalavras.put("aeiou".charAt(i), new ArrayList<String>());

			for (String palavra : palavras) {
				if (palavra.toLowerCase().indexOf("aeiou".charAt(i)) > -1) {
					mapaDePalavras.get("aeiou".charAt(i)).add(palavra);
				}
			}
			Collections.sort(mapaDePalavras.get("aeiou".charAt(i)));
		}
		
		System.out.println(mapaDePalavras);
	}

}
