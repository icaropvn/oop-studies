public class Funcionario extends Pessoa {
	private String setor;
	private boolean trabalhando;
	
	// construtor
	public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
		super(nome, idade, sexo);
		this.setor = setor;
		this.trabalhando = trabalhando;
	}
	
	// métodos específicos
	public void trabalhar() {
		setTrabalhando(!isTrabalhando());
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSetor: " + getSetor() + "\nTrabalhando? " + (isTrabalhando() ? "Sim" : "Não");
	}
	
	// getters e setters
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public boolean isTrabalhando() {
		return this.trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
}