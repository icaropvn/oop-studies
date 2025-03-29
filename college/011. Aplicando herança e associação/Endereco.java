public class Endereco {
  private long id;
  private String rua;
  private int numero;
  private String complemento;
  private String bairro;
  private String cidade;
  private String estado;
  private String pais;

  // construtor
  public Endereco(long id, String rua, int numero, String complemento, String bairro, String cidade, String estado, String pais) {
    this.id = id;
    this.rua = rua;
    this.numero = numero;
    this.complemento = complemento;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.pais = pais;
  }

  // métodos específicos
  public void exibirDados() {
    System.out.println("   ID: " + id + "\n   Rua: " + rua + "\n   Número: " + numero + "\n   Complemento: " + complemento + "\n   Bairro: " + bairro + "\n   Cidade: " + cidade + "\n   Estado: " + estado + "\n   País: " + pais);
  }

  // getters e setters
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }
}