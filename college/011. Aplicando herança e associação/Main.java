import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco(101, "Rua das Palmeiras", 123, "Apto 202", "Jardim Central", "Curitiba", "PR", "Brasil");
		Endereco endereco2 = new Endereco(102, "Avenida Brasil", 456, "Bloco B", "Centro", "São Paulo", "SP", "Brasil");
		Endereco endereco3 = new Endereco(103, "Rua Monte Azul", 789, "", "Vila Verde", "Belo Horizonte", "MG", "Brasil");

		Pessoa pessoa1 = new Pessoa(1, "Mariana Costa", "mariana.costa@example.com", "(41) 99876-5432", endereco1, LocalDate.of(1995, 6, 15), "mari.costa", "senhaSegura123");

		Passageiro passageiro = new Passageiro(2, "Carlos Lima", "carlos.lima@example.com", "(11) 91234-5678", endereco2, LocalDate.of(1990, 3, 10), "carlos.l", "senha456", "1234-5678-9012-3456", "123.456.789-00");

		Funcionario funcionario = new Funcionario(3, "Ana Beatriz", "ana.beatriz@example.com", "(31) 98765-4321", endereco3, LocalDate.of(1988, 12, 5), "ana.b", "senha789", "FUNC001", "12345-6");

		pessoa1.exibirDados();
    		System.out.println();
    		passageiro.exibirDados();
    		System.out.println();
    		funcionario.exibirDados();
	}
}