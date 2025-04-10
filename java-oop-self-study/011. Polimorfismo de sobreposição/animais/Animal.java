package animais;

public abstract class Animal {
	protected float peso;
	protected int idade;
	protected int membros;
	
	public Animal(float peso, int idade, int membros) {
		this.peso = peso;
		this.idade = idade;
		this.membros = membros;
	}
	
	// getters e setters
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMembros() {
		return membros;
	}

	public void setMembros(int membros) {
		this.membros = membros;
	}
	
	// métodos específicos
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
	
	public void mostrarDados() {
		System.out.println("Peso: " + peso + "Kg");
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Quantidade de membros: " + membros);
	}
}