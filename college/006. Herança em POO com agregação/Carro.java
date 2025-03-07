public class Carro extends Veiculo {
	private int quantidadePortas;
	private int quantidadeAssentos;
	private float potencia;
	
	// construtor de Carro
	public Carro(int codigo, Modelo modelo, Marca marca, int anoFabricacao, int quantidadePortas, int quantidadeAssentos, float potencia) {
		super(codigo, modelo, marca, anoFabricacao);
		this.quantidadePortas = quantidadePortas;
		this.quantidadeAssentos = quantidadeAssentos;
		this.potencia = potencia;
	}
	
	// métodos específicos de Carro
	public void imprimir() {
		super.imprimir();
		System.out.println("Quantidade de portas: " + this.getQuantidadePortas() + "\nQuantidade de assentos: " + this.getQuantidadeAssentos() + "\nPotência: " + this.getPotencia() + "\n");
	}
	
	// getters e setters de Carro
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	public int getQuantidadeAssentos() {
		return quantidadeAssentos;
	}
	
	public void setQuantidadeAssentos(int quantidadeAssentos) {
		this.quantidadeAssentos = quantidadeAssentos;
	}
	
	public float getPotencia() {
		return potencia;
	}
	
	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}
}
