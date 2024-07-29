package aula1.collections;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		String frase = JOptionPane.showInputDialog("Insira uma frase");
		frase = frase.replace(" ", "");

		Map<Character, Integer> mapDeLetras = new HashMap<Character, Integer>();

		for (int i = 0; i < frase.length(); i++) {
			char caractere = frase.charAt(i);
			if (mapDeLetras.containsKey(caractere)) {
				mapDeLetras.put(caractere, mapDeLetras.get(caractere) + 1);
			} else {
				mapDeLetras.put(caractere, 1);
			}
		}
		
		System.out.println(mapDeLetras.toString());

	}

}
