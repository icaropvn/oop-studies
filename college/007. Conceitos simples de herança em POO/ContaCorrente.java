public class ContaCorrente extends Conta {
	// construtor de ContaCorrente
	public ContaCorrente(String nome) {
		super(nome);
	}
	
	// métodos específicos de ContaCorrente
	public void transferir(Conta contaPara, float valor) {
		if(getSaldo() < valor) {
			System.out.println("Erro. Você não tem saldo o suficiente.");
			return;
		}
		
		setSaldo(getSaldo() - valor);
		contaPara.setSaldo(contaPara.getSaldo() + valor);
	}
}
