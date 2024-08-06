package aula6.outros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

	private String nome;
	private String telefone;
	private LocalDate dataNascimento;

	public Pessoa(String nome, String telefone, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(nome);
		builder.append(", Telefone: ");
		builder.append(telefone);
		builder.append(", Data de nascimento: ");
		builder.append(dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		return builder.toString();
	}
	
	
}
