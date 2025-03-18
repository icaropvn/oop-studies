public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	// construtor
	public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
		super(nome, idade, sexo);
		this.matricula = matricula;
		this.curso = curso;
	}
	
	// métodos especiais
	public void cancelarMatricula() {
		System.out.println("Matrícula cancelada.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nMatrícula: " + getMatricula() + "\nCurso: " + getCurso();
	}
	
	// getters e setters
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}