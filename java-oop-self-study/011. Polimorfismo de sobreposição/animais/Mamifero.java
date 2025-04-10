package animais;

public class Mamifero extends Animal {
	protected String corPelo;
	
	public Mamifero(float peso, int idade, int membros, String corPelo) {
		super(peso, idade, membros);
		this.corPelo = corPelo;
	}
	
	// getters e setters
	public String getCorPelo() {
		return corPelo;
	}
	
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	// métodos específicos
	@Override
	public void locomover() {
		System.out.println("Mamífero correndo.");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Mamífero mamando.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Mamífero emite um som.");
	}
	
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Cor do pelo: " + corPelo);
	}
}
