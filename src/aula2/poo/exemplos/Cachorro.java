package aula2.poo.exemplos;

public class Cachorro extends Animal {
	
	public Cachorro() {
		metodoProtegido();
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Latir");
	}
}
