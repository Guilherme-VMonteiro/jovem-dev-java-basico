package aula6.outros;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {

		List<Evento> eventos = new ArrayList<>();

		adicionarEventos(eventos);

		int opcao = 0;

		do {

			opcao = coletaOpcao();

			switch (opcao) {
			case 1: {
				coletarEventos(TipoDeEvento.SOCIAL, eventos);
				break;
			}
			case 2: {
				coletarEventos(TipoDeEvento.LAZER, eventos);
				break;
			}
			case 3: {
				coletarEventos(TipoDeEvento.PROFISSIONAL, eventos);
				break;
			}
			case 4: {
				coletarEventos(TipoDeEvento.OUTROS, eventos);
				break;
			}
			case 5: {
				// Sair
				break;
			}
			default: {
				JOptionPane.showMessageDialog(null, "Insira uma opção válida!");
			}
			}

		} while (opcao != 5);

	}

	private static void coletarEventos(TipoDeEvento tipo, List<Evento> eventos) {

		StringBuilder builder = new StringBuilder();

		builder.append("Eventos tipo '" + tipo + "':");

		builder.append("\n\nPendentes:\n");

		builder.append(eventos.stream().filter(evento -> evento.getTipo() == tipo)
				.filter(evento -> LocalDateTime.now().isBefore(evento.getDataHora()))
				.map(evento -> "  " + evento.getDescricao() + " - "
						+ evento.getDataHora().format(DateTimeFormatter.ofPattern("(E) dd/MM/yyyy - kk:mm")))
				.collect(Collectors.joining("\n")));

		builder.append("\n\nConcluídos:\n");

		builder.append(eventos.stream().filter(evento -> evento.getTipo() == tipo)
				.filter(evento -> LocalDateTime.now().isAfter(evento.getDataHora()))
				.map(evento -> "  " + evento.getDescricao() + " - "
						+ evento.getDataHora().format(DateTimeFormatter.ofPattern("(E) dd/MM/yyyy - kk:mm")))
				.collect(Collectors.joining("\n")));

		JOptionPane.showMessageDialog(null, builder.toString());
	}

	private static void adicionarEventos(List<Evento> eventos) {

		eventos.add(new Evento("Futebol", LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.of(15, 30)),
				TipoDeEvento.LAZER));

		eventos.add(
				new Evento("Campeonato", LocalDateTime.of(LocalDate.now(), LocalTime.of(19, 30)), TipoDeEvento.LAZER));

		eventos.add(new Evento("Beto carreiro", LocalDateTime.of(LocalDate.now().minusDays(5), LocalTime.of(15, 30)),
				TipoDeEvento.LAZER));

		eventos.add(new Evento("Médico", LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.of(13, 30)),
				TipoDeEvento.OUTROS));

		eventos.add(
				new Evento("Dentista", LocalDateTime.of(LocalDate.now(), LocalTime.of(15, 30)), TipoDeEvento.OUTROS));

		eventos.add(new Evento("Lavar o carro", LocalDateTime.of(LocalDate.now().minusDays(5), LocalTime.of(10, 30)),
				TipoDeEvento.OUTROS));

		eventos.add(new Evento("Reunião de alinhamento",
				LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.of(7, 30)), TipoDeEvento.PROFISSIONAL));

		eventos.add(new Evento("Sprint", LocalDateTime.of(LocalDate.now(), LocalTime.of(13, 30)),
				TipoDeEvento.PROFISSIONAL));

		eventos.add(new Evento("Reunião de negócios",
				LocalDateTime.of(LocalDate.now().minusDays(5), LocalTime.of(18, 30)), TipoDeEvento.PROFISSIONAL));

		eventos.add(new Evento("Festa da Tia", LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.of(19, 50)),
				TipoDeEvento.SOCIAL));

		eventos.add(
				new Evento("Churrasco", LocalDateTime.of(LocalDate.now(), LocalTime.of(19, 50)), TipoDeEvento.SOCIAL));

		eventos.add(new Evento("Confraternização", LocalDateTime.of(LocalDate.now().minusDays(5), LocalTime.of(19, 50)),
				TipoDeEvento.SOCIAL));

	}

	private static int coletaOpcao() {
		try {
			return Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de evento você deseja pesquisar?\n\n"
					+ "1 - Social\n" + "2 - Lazer\n" + "3 - Profissional\n" + "4 - Outros\n\n" + "5 - Sair"));

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Insira uma opção válida!");
			return coletaOpcao();
		}
	}
}
