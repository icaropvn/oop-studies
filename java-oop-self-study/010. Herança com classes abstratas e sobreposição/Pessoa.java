public abstract class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	// construtor
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	// métodos específicos
	public void fazerAniversario() {
		setNome(getNome() + 1);
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSexo: " + getSexo();
	}
	
	// getters e setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}