public class Aluno extends Pessoa {
	private String matricula;
	private String curso;
	private double coeficiente;
	private int anoIngresso;
	
	public Aluno(String matricula, String curso, double coeficiente, int anoIngresso) {
		this.matricula = matricula;
		this.curso = curso;
		this.coeficiente = coeficiente;
		this.anoIngresso = anoIngresso;
	}
	
	// getters e setters
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public double getCoeficiente() {
		return coeficiente;
	}
	
	public void setCoeficiente(double coeficiente) {
		this.coeficiente = coeficiente;
	}
	
	public int getAnoIngresso() {
		return anoIngresso;
	}
	
	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	
	// métodos específicos
	public void cadastrar() {
		// realizar cadastro de Aluno
	}
	
	public void imprimir() {
		System.out.println("Nome: " + super.getNome() +
				   "\nMatrícula: " + getMatricula() +
				   "\nCurso: " + getCurso() +
				   "\nCoeficiente: " + getCoeficiente() +
				   "\nAno de ingresso: " + getAnoIngresso());
	}
}
