public class Professor extends Pessoa {
	private String especialidade;
	private float salario;
	
	// construtor
	public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
		super(nome, idade, sexo);
		this.especialidade = especialidade;
		this.salario = salario;
	}
	
	// métodos específicos
	public void receberAumento(float aumento) {
		setSalario(getSalario() + aumento);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nEspecialidade: " + getEspecialidade() + "\nSalário: R$" + getSalario();
	}
	
	// getters e setters
	public String getEspecialidade() {
		return this.especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}