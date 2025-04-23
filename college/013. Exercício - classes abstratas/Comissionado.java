public class Comissionado extends Empregado{
	private double salarioBase;
	private double comissao;
	private int quantidade;
	
	public Comissionado(String nome, String endereco) {}
	
	public Comissionado(String nome, String endereco, double salarioBase, double comissao, int quantidade) {
		super(nome, endereco);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
		this.quantidade = quantidade;
	}
	
	//getters and setters
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
	// métodos específicos
	@Override
	public double calcularSalario(){
		return salarioBase + comissao*quantidade;
	}
}
