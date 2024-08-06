package aula6.outros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		Pessoa primeiraPessoa = coletaPessoa();
		Pessoa segundaPessoa = coletaPessoa();

		StringBuilder builder = new StringBuilder();
		if(primeiraPessoa.getDataNascimento().equals(segundaPessoa.getDataNascimento())) {
			builder
				.append(primeiraPessoa.getNome() + " e " + segundaPessoa.getNome())
				.append(" nasceram na mesma data!\n")
				.append(primeiraPessoa.toString() + "\n" + segundaPessoa.toString());
				
			System.out.println(builder);
		}else if(primeiraPessoa.getDataNascimento().isBefore(segundaPessoa.getDataNascimento())) {
			builder
				.append(primeiraPessoa.getNome() + " é mais velho que " + segundaPessoa.getNome() + "\n")
				.append(primeiraPessoa.toString());
			
			System.out.println(builder);
		}else {
			builder
				.append(segundaPessoa.getNome() + " é mais velho que " + primeiraPessoa.getNome() + "\n")
				.append(segundaPessoa.toString());
			
			System.out.println(builder);
		}
	}

	static Pessoa coletaPessoa() {

		Pessoa retorno = null;

		while (Objects.isNull(retorno)) {

			try {
				String nome = JOptionPane.showInputDialog("Insira o nome da pessoa:");

				if (nome.equals("")) {
					throw new IllegalArgumentException("O nome não pode ser nulo!");
				}

				String telefone = JOptionPane.showInputDialog("Insira o telefone de " + nome + ":");

				if (telefone.equals("")) {
					throw new IllegalArgumentException("O telefone não pode ser nulo!");
				}

				String dataNascimento = JOptionPane.showInputDialog("Insira a data de nascimento de " + nome + ":");

				retorno = new Pessoa(nome, telefone,
						LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

			} catch (NullPointerException e) {
				break;
			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			} catch (DateTimeParseException e) {
				JOptionPane.showMessageDialog(null, "A data de nascimento deve ser válida!");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		return retorno;
	}
}
