package animais;

public class Peixe extends Animal {
	protected String corEscama;
	
	public Peixe(float peso, int idade, int membros, String corEscama) {
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
		System.out.println("Peixe nadando.");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Peixe se alimentando.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Peixe faz som?");
	}
	
	@Override
	public void mostrarDados() {
		super.mostrarDados();
		System.out.println("Cor da escama: " + corEscama);
	}
	
	public void soltarBolha() {
		System.out.println("Peixe soltou uma bolhinha!");
	}
}
