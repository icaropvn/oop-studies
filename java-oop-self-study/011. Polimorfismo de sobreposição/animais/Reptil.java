package animais;

public class Reptil extends Animal {
	protected String corEscama;
	
	public Reptil(float peso, int idade, int membros, String corEscama) {
		super(peso, idade, membros);
		this.corEscama = corEscama;
	}
	
	// getters e setters
	public String getCorEscama() {
		return corEscama;
	}
	
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	// métodos específicos
	@Override
	public void locomover() {
		System.out.println("Réptil rastejando.");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Réptil se alimentando.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Réptil emite um som.");
	}
	
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Cor da escama: " + corEscama);
	}
}
