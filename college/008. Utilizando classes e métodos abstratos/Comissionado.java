public class Comissionado extends Funcionario {
	private float valorVendas;
	
	// construtores
	public Comissionado(int matricula, String nome, float salario, float valorVendas) {
		super(matricula, nome, salario);
		this.valorVendas = valorVendas;
	}
	
	public Comissionado() {
		super();
	}
	
	// métodos específicos
	public float getSalarioFinal() {
		return (this.getSalario() + this.valorVendas * 0.03f);
	}
	
	// getters e setters
	public float getValorVendas() {
		return this.valorVendas;
	}
	
	public void setValorVendas(float valorVendas) {
		this.valorVendas = valorVendas;
	}
}