package aula6.outros;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {

		List<Evento> eventos = new ArrayList<>();

		eventos.add(new Evento("Futebol",
				LocalDateTime.of(LocalDate.of(2024, 12, 10), LocalTime.of(15, 30)), TipoDeEvento.LAZER));
		
		eventos.add(new Evento("Ir no centro",
				LocalDateTime.of(LocalDate.of(2024, 1, 20), LocalTime.of(13, 30)), TipoDeEvento.OUTROS));
		
		eventos.add(new Evento("Reunião de alinhamento",
				LocalDateTime.of(LocalDate.of(2024, 8, 9), LocalTime.of(13, 30)), TipoDeEvento.PROFISSIONAL));
		
		eventos.add(new Evento("Festa da Tia",
				LocalDateTime.of(LocalDate.of(2023, 5, 9), LocalTime.of(19, 50)), TipoDeEvento.SOCIAL));
		
		switch (coletaOpcao()) {
			
		}

	}

	private static TipoDeEvento coletaOpcao() {
		String opcao = JOptionPane.showInputDialog("Qual tipo de evento você deseja pesquisar?");

	}
}
