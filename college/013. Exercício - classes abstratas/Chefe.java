public class Chefe extends Empregado {
	private double salarioMensal;
	
	public Chefe(String nome, String endereco) {}
	
	public Chefe(String nome, String endereco, double salarioMensal) {
		super(nome, endereco);
		this.salarioMensal = salarioMensal;
	}
	
	// getters e setters
	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	// métodos específicos
	public double calcularSalario() {
		return salarioMensal;
	}
}