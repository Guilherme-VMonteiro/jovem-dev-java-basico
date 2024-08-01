package aula4.lambda;

import java.time.LocalDate;

public class Aluno {

	int numeroChamada;
	String nome;
	LocalDate dataNascimento;

	public Aluno(int numeroChamada, String nome, LocalDate dataNascimento) {
		this.numeroChamada = numeroChamada;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return nome + ", dataNascimento: " + dataNascimento;
	}
	
	
}
