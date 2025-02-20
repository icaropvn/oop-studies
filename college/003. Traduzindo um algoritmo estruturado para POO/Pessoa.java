import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    String nome;
    LocalDate dataNascimento;

    // construtor personalizado dos objetos da classe Pessoa
    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }

    long calculaIdade() {
        LocalDate dataAtual = LocalDate.now();
        return this.dataNascimento.until(dataAtual, ChronoUnit.YEARS);
    }

    String informaNome() {
        return this.nome;
    }

    void ajustaDataNascimento(int dia, int mes, int ano) {
        this.dataNascimento = LocalDate.of(ano, mes, dia);
    }
}
