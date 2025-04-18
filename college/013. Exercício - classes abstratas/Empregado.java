public abstract class Empregado {
	private String nome;
	private String endereco;
	
	public Empregado() {}
	
	public Empregado(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	// getters e setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// métodos específicos
	public abstract double calcularSalario();
}