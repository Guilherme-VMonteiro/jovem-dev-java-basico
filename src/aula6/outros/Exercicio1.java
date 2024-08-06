package aula6.outros;

public class Exercicio1 {

	public static void main(String[] args) {
		
		for (DiaSemanaEnum diaDaSemana : DiaSemanaEnum.values()) {
			System.out.println(diaDaSemana.getNome() + " é fim de semana? " + diaDaSemana.isFimDeSemana());
		}
	}

}
