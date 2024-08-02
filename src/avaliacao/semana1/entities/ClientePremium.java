package avaliacao.semana1.entities;

import java.time.LocalDate;

public class ClientePremium extends Cliente{

	public ClientePremium(String nome, LocalDate dataNascimento) {
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
		this.setPremium(true);
	}
}
