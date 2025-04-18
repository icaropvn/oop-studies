public class Main {
	public static void main(String[] args) {
		// Criando um objeto Chefe
        Chefe chefe = new Chefe("João Silva", "Rua das Flores, 123", 8000.00);
        System.out.println("Chefe: " + chefe.getNome());
        System.out.println("Salário: R$ " + chefe.calcularSalario());

        // Criando um objeto Comissionado
        Comissionado vendedor = new Comissionado("Maria Souza", "Av. Central, 456", 2000.00, 150.00, 10);
        System.out.println("\nComissionado: " + vendedor.getNome());
        System.out.println("Salário Base: R$ " + vendedor.getSalarioBase());
        System.out.println("Comissão por venda: R$ " + vendedor.getComissao());
        System.out.println("Quantidade de vendas: " + vendedor.getQuantidade());
        System.out.println("Salário Total: R$ " + vendedor.calcularSalario());
	}
}