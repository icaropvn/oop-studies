public class ContaPoupanca extends Conta {
	// construtor de ContaPoupanca
	public ContaPoupanca(String nome) {
		super(nome);
	}
	
	// métodos específicos de ContaPoupanca
	public void investir(float valor, int dias) {
		setSaldo(getSaldo() - valor);
		
		for(int i=0; i<dias; i++) {
			valor += (valor * 0.0005f);
		}
		
		setSaldo(getSaldo() + valor);
	}
}
