public class Main {
	public static void main(String[] args) {
		Conta conta1 = new Conta(1, "Bruno Azevedo", 1200);
		Conta conta2 = new Conta(2, "Pedro Bonfim", 500);
		
		System.out.println("Conta 01:\nNome: " + conta1.getNome() + "\nSaldo: R$" + conta1.getSaldo());
		System.out.println("\nConta 02:\nNome: " + conta2.getNome() + "\nSaldo: R$" + conta2.getSaldo());
		
		conta1.sacar(200);
		System.out.println("\nConta 01 após saque de 200: " + conta1.getSaldo());
		
		conta2.depositar(300);
		System.out.println("\nConta 02 após depositar 300: " + conta2.getSaldo());
		
		conta1.transferir(conta2, 100);
		System.out.println("\nConta 01 após transferência de 100 para Conta 02: " + conta1.getSaldo());
		System.out.println("Conta 02 após recebimento de transferência: " + conta2.getSaldo());
		
		System.out.println("\nSaldo final de " + conta1.getNome() + ": " + conta1.getSaldo());
		System.out.println("Saldo final de " + conta2.getNome() + ": " + conta2.getSaldo());
	}
}