package repteis;

import animais.Reptil;

public class Tartaruga extends Reptil {
	public Tartaruga(float peso, int idade, int membros, String corEscama) {
		super(peso, idade, membros, corEscama);
	}
	
	// métodos específicos
	@Override
	public void locomover() {
		System.out.println("Andando... muito... muito... muito... devagar...");
	}
}