package aula2.poo.exemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exemplo1 {

	public static void main(String[] args) {

		//Atributos e Métodos estaticos podem ser acessados sem precisar de uma instanciação
//		Collections.sort();
		
		//CUIDADO COM O == 
		//O == compara enderço de memória
		//Cada objeto possui o metodo .equals() que compara o seu valor
		
		//Datas
		
		LocalDate dataHoje = LocalDate.now();
//		LocalDate dataAniversario = LocalDate.parse("2004-12-25");
		LocalDate dataAniversario = LocalDate.parse("25/12/2004", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDateTime dataEHoraAtual = LocalDateTime.now();
		
		System.out.println(dataHoje.plusDays(300));
		System.out.println(dataAniversario.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println(dataEHoraAtual);
		
		String a = "abc";
		String b = "abd";
		
		System.out.println(a == b);
		
	}

}
