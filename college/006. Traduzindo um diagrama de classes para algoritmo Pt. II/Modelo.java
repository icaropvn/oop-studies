public class Modelo {
	private int codigo;
	private String descricao;
	
	// construtores de Modelo
	public Modelo(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Modelo(){};
	
	// métodos específicos de Modelo
	public void imprimir() {
		System.out.println("Código: " + this.codigo + "\nDescrição: " + this.descricao);
	}
	
	// getters e setters de Modelo
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
