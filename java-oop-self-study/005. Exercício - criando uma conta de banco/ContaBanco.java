public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	// Construtor de ContaBanco
	public ContaBanco(int numConta, String dono) {
		this.numConta = numConta;
		this.tipo = "Indefinido";
		this.dono = dono;
		this.saldo = 0;
		this.status = false;
	}
	
	// Métodos específicos de ContaBanco
	public void abrirConta(String tipo) {
		tipo.toUpperCase();
		if(tipo != "CC" && tipo != "CP") {
			System.out.println("Tipo de conta inválido. A conta não foi aberta.");
			return;
		}
		
		this.setStatus(true);
		this.setTipo(tipo);
		
		if(tipo == "CC")
			this.setSaldo(50);
		else
			this.setSaldo(150);
	}
	
	public void fecharConta() {
		if(this.getSaldo() != 0) {
			System.out.println("Sua conta possui saldo sobrando ou débitos pendentes. Regularize para fechar.");
			return;
		}
		
		this.setStatus(false);
	}
	
	public void depositar(float deposito) {
		if(this.getStatus() == false) {
			System.out.println("Abra sua conta para realizar um depósito.");
			return;
		}
		
		this.setSaldo(getSaldo() + deposito);
	}
	
	public void sacar(float saque) {
		if(this.getStatus() == false) {
			System.out.println("Abra sua conta para realizar um saque.");
			return;
		}
		
		if(this.getSaldo() < saque) {
			System.out.println("Você não possui saldo o suficiente.");
			return;
		}
		
		this.setSaldo(getSaldo() - saque);
	}
	
	public void pagarMensalidade() {
		float mensalidade;
		
		mensalidade = this.getTipo() == "CC" ? 12 : 20;
		
		if(this.getStatus() == false) {
			System.out.println("Abra sua conta para pagar a mensalidade.");
			return;
		}
		
		if(this.getSaldo() < mensalidade) {
			System.out.println("Não conseguimos cobrar a mensalidade de sua conta. Entre em contato com o suporte para regularizar a situação.");
			return;
		}
		
		this.setSaldo(getSaldo() - mensalidade);
	}
	
	// Getters e Setters de ContaBanco
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
}
