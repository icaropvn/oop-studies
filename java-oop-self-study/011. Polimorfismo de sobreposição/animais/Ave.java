package animais;

public class Ave extends Animal {
	protected String corPena;
	
	public Ave(float peso, int idade, int membros, String corPena) {
		super(peso, idade, membros);
		this.corPena = corPena;
	}
	
	// getters e setters
	public String getCorPena() {
		return corPena;
	}
	
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	// métodos específicos
	@Override
	public void locomover() {
		System.out.println("Ave voando.");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Ave se alimentando.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Ave emite um som.");
	}
	
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Cor da pena: " + corPena);
	}
	
	public void fazerNinho() {
		System.out.println("Ave construiu um ninho.");
	}
}
