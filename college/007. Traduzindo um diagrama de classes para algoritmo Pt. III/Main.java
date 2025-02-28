public class Main {
    public static void main(String[] args) {
    	ContaCorrente cc = new ContaCorrente("Jorginho");
    	ContaPoupanca cp = new ContaPoupanca("Creusa");
    	
    	cc.setSaldo(10000);
    	cp.setSaldo(5000);
    	System.out.println("Saldo inicial de Jorginho: R$" + cc.getSaldo());
    	System.out.println("Saldo inicial de Creusa: R$" + cp.getSaldo());
    	System.out.println("\n================================");
    	
    	System.out.println("\nJorginho ganhou 2 mil!");
    	cc.depositar(2000);
    	System.out.println("Saldo de Jorginho: R$" + cc.getSaldo());
    	System.out.println("\n================================");
    	
    	System.out.println("\nJorginho decide dividir o que ganhou com Creusa.");
    	cc.transferir(cp, 1000);
    	System.out.println("Saldo de Jorginho: R$" + cc.getSaldo());
    	System.out.println("Saldo de Creusa: R$" + cp.getSaldo());
    	System.out.println("\n================================");
    	
    	System.out.println("\nCreusa investe o que ganhou de Jorginho por dois meses.");
    	cp.investir(1000, 60);
    	System.out.println("Saldo de Creusa: R$" + String.format("%.2f", cp.getSaldo()));
    	System.out.println("\n================================");
    	
    	System.out.println("\nJorginho quer muito comprar um tênis da Nike. O tênis custa R$800,00.");
    	cc.sacar(800);
    	System.out.println("Saldo de Jorginho: R$" + cc.getSaldo());
    	System.out.println("\n================================");
    	
    	System.out.println("\nDetalhes das contas de Jorginho e Creusa:");
    	System.out.println("\nJorginho:\nId: " + cc.getId() + "\nNome: " + cc.getNome() + "\nSaldo: R$" + String.format("%.2f", cc.getSaldo()));
    	System.out.println("\nCreusa:\nId: " + cp.getId() + "\nNome: " + cp.getNome() + "\nSaldo: R$" + String.format("%.2f", cp.getSaldo()));
    }
}