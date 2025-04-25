public abstract class Funcionario extends Pessoa {
	private String matricula;
	private String ctps;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String matricula, String ctps) {
		this.matricula = matricula;
		this.ctps = ctps;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getCtps() {
		return ctps;
	}
	
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("Matrícula: " + getMatricula());
		System.out.println("CTPS: " + getCtps());
	}
}