public class Conta {
	private static int proxId = 0;
	protected int id;
	protected String nome;
	protected float saldo;
	
	// construtor de Conta
	public Conta(String nome) {
		this.id = ++proxId;
		this.nome = nome;
		this.saldo = 0f;
	}
	
	// métodos específicos de Conta
	public void depositar(float valor) {
		setSaldo(getSaldo() + valor);
	}
	
	public void sacar(float valor) {
		if(getSaldo() < valor) {
			System.out.println("Erro. Você não tem saldo o suficiente.");
			return;
		}
		
		setSaldo(getSaldo() - valor);
	}
	
	// getters e setters de Conta
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}
