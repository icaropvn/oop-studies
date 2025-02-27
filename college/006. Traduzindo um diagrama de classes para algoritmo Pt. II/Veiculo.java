public class Veiculo {
	private int codigo;
	private Modelo modelo;
	private Marca marca;
	private int anoFabricacao;
	
	// construtor de Veiculo
	public Veiculo(int codigo, Modelo modelo, Marca marca, int anoFabricacao) {
		this.codigo = codigo;
		this.modelo = modelo == null ? new Modelo() : modelo;
		this.marca = marca == null ? new Marca() : marca;
		this.anoFabricacao = anoFabricacao;
	}
	
	// métodos específicos de Veiculo
	public void imprimir() {
		System.out.println("Código: " + this.getCodigo() + "\nModelo: " + this.getModelo().getDescricao() + "\nMarca: " + this.getMarca().getDescricao() + "\nAno de fabricação: " + this.getAnoFabricacao());
	}
	
	// getters e setters de Veiculo
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public Modelo getModelo() {
		return this.modelo;
	}
	
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
}
