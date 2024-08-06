package aula6.outros.exemplos.stringBuilder;

public class Main {

	public static void main(String[] args) {

		String nome = "Guilherme";
		int idade = 19;
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("O nome do usuário é ");
		builder.append(nome);
		builder.append(" e ele tem ");
		builder.append(idade);
		
		System.out.println(builder.toString());
		
	}

}
