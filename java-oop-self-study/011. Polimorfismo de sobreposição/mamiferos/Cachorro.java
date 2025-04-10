package mamiferos;

import animais.Mamifero;

public class Cachorro extends Mamifero {
	public Cachorro(float peso, int idade, int membros, String corPelo) {
		super(peso, idade, membros, corPelo);
	}
	
	// métodos específicos
	@Override
	public void emitirSom() {
		System.out.println("Au! Au!");
	}
	
	public void abanarRabo() {
		System.out.println("Cachorro está feliz!");
	}
}