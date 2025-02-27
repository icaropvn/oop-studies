public class Onibus extends Veiculo {
	private int capacidade;
	private boolean possuiBanheiro;
	
	// construtor de Onibus
	public Onibus(int codigo, Modelo modelo, Marca marca, int anoFabricacao, int capacidade, boolean possuiBanheiro) {
		super(codigo, modelo, marca, anoFabricacao);
		this.capacidade = capacidade;
		this.possuiBanheiro = possuiBanheiro;
	}
	
	// métodos específicos de Onibus
	public void imprimir() {
		super.imprimir();
		System.out.println("Capacidade: " + this.getCapacidade() + "\nPossui banheiro? " + this.hasBanheiro() + "\n");
	}
	
	// getters e setters de Onibus
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public boolean hasBanheiro() {
		return possuiBanheiro;
	}
	
	public void setPossuiBanheiro(boolean possuiBanheiro) {
		this.possuiBanheiro = possuiBanheiro;
	}
}