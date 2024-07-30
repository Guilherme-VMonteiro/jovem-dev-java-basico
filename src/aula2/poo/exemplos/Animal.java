package aula2.poo.exemplos;

public abstract class Animal {

	public int tamanho;
	public String nome;

	public void andar() {
		System.out.println("Animal andando!");
	}

	protected void metodoProtegido() {
		System.out.println("Metodo protegido");
	}

	public abstract void fazerBarulho();
}
