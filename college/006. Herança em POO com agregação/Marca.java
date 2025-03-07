public class Marca {
	private int codigo;
	private String descricao;
	
	// construtores de Marca
	public Marca(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Marca(){}
	
	// métodos específicos de Marca
	public void imprimir() {
		System.out.println("Código: " + this.codigo + "\nDescrição: " + this.descricao);
	}
	
	// getters e setters de Marca
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	};
}
