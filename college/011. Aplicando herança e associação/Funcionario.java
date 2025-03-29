import java.time.LocalDate;

public class Funcionario extends Pessoa {
  private String codigo;
  private String contaCorrente;

  // construtor
  public Funcionario(long id, String nome, String email, String telefone, Endereco endereco, LocalDate dataNascimento, String usuario, String senha, String codigo, String contaCorrente) {
    super(id, nome, email, telefone, endereco, dataNascimento, usuario, senha);
    this.codigo = codigo;
    this.contaCorrente = contaCorrente;
  }

  // métodos específicos
  public void exibirDados() {
    super.exibirDados();
    System.out.println("Código: " + codigo + "\nConta Corrente: " + contaCorrente);
  }

  // getters e setters
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getContaCorrente() {
    return contaCorrente;
  }

  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }
}