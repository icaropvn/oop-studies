import java.time.LocalDate;

public class Passageiro extends Pessoa {
  private String numeroCartao;
  private String documento;

  // construtor
  public Passageiro(long id, String nome, String email, String telefone, Endereco endereco, LocalDate dataNascimento, String usuario, String senha, String numeroCartao, String documento) {
    super(id, nome, email, telefone, endereco, dataNascimento, usuario, senha);
    this.numeroCartao = numeroCartao;
    this.documento = documento;
  }

  // métodos específicos
  public void exibirDados() {
    super.exibirDados();
    System.out.println("Número do Cartão: " + numeroCartao + "\nDocumento: " + documento);
  }

  // getters e setters
  public String getNumeroCartao() {
    return numeroCartao;
  }

  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }
}