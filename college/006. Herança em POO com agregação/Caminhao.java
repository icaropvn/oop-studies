public class Caminhao extends Veiculo {
	private int quantidadeEixos;
	
	// construtor de Caminhao
	public Caminhao(int codigo, Modelo modelo, Marca marca, int anoFabricacao, int quantidadeEixos) {
		super(codigo, modelo, marca, anoFabricacao);
		this.quantidadeEixos = quantidadeEixos;
	}
	
	// métodos específicos de Caminhao
	public void imprimir() {
		super.imprimir();
		System.out.println("Quantidade de eixos: " + this.getQuantidadeEixos() + "\n");
	}
	
	// getters e setters de Caminhao
	public int getQuantidadeEixos() {
		return quantidadeEixos;
	}

	public void setQuantidadeEixos(int quantidadeEixos) {
		this.quantidadeEixos = quantidadeEixos;
	}
}