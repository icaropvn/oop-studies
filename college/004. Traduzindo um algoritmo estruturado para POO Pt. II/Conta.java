public class Conta {
	private int id;
	private String nome;
	private float valor;
	
	public Conta(int id, String nome, float valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}
	
	public float getSaldo() {
		return this.valor;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void depositar(float valor) {
		this.valor += valor;
	}
	
	public void sacar(float valor) {
		if(valor > this.valor) {
			System.out.println("Saldo insuficiente.");
			return;
		}
		
		this.valor -= valor;
	}
	
	public void transferir(Conta contaDestino, float valor) {
		if(valor > this.valor) {
			System.out.println("Saldo insuficiente.");
			return;
		}
		
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
}