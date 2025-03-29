import java.time.LocalDate;

public class Pessoa {
	private long id;
	private String nome;
	private String email;
	private String telefone;
	private Endereco endereco;
	private LocalDate dataNascimento;
	private String usuario;
	private String senha;

	// construtor
	public Pessoa(long id, String nome, String email, String telefone, Endereco endereco, LocalDate dataNascimento, String usuario, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.usuario = usuario;
		this.senha = senha;
	}

	// métodos específicos
	public void exibirDados() {
    		System.out.println("ID: " + id + "\nNome: " + nome + "\nEmail: " + email + "\nTelefone: " + telefone + "\nEndereço: ");
    		endereco.exibirDados();
    		System.out.println("Data de Nascimento: " + dataNascimento + "\nUsuário: " + usuario + "\nSenha: " + senha);
  	}

	// getters e setters
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }
}