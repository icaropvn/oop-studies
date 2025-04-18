public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected float experiencia;
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		experiencia = 0;
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

	public float getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}
	
	// métodos específicos
	protected void ganharExperiencia(float experiencia) {
		setExperiencia(getExperiencia() + experiencia);
	}
}