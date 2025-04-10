package mamiferos;

import animais.Mamifero;

public class Canguru extends Mamifero {
	public Canguru(float peso, int idade, int membros, String corPelo) {
		super(peso, idade, membros, corPelo);
	}
	
	// métodos específicos
	@Override
	public void locomover() {
		System.out.println("Canguru saltando.");
	}
	
	public void usarBolsa() {
		System.out.println("Canguru usou bolsa.");
	}
}