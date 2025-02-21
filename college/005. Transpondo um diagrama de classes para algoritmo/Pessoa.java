import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private int codigo;
    private String nome;
    private LocalDate dataNascimento;
    private List<Endereco> enderecos;
    private List<Telefone> telefones;

    // construtor de Pessoa
    public Pessoa(int codigo, String nome, LocalDate dataNascimento, List<Endereco> enderecos, List<Telefone> telefones) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.enderecos = (enderecos == null) ? new ArrayList<>() : enderecos;
        this.telefones = (telefones == null) ? new ArrayList<>() : telefones;
    }

    // métodos específicos
    public void addEndereco(Endereco endereco) {
    	if(this.enderecos.contains(endereco)) {
    		System.out.println("Este endereço já está adicionado.");
    		return;
    	}
    	
    	this.enderecos.add(endereco);
    }

    public void removeEndereco(Endereco endereco) {
    	this.enderecos.remove(endereco);
    }

    public void addTelefone(Telefone telefone) {
    	if(this.telefones.contains(telefone)) {
    		System.out.println("Este telefone já está adicionado.");
    		return;
    	}
    	
    	this.telefones.add(telefone);
    }

    public void removeTelefone(Telefone telefone) {
    	this.telefones.remove(telefone);
    }
    
    @Override
    public String toString() {
    	return "Código: " + this.codigo + "\nNome: " + this.nome + "\nData de nascimento: " + this.dataNascimento;
    }

    // getters e setters de Pessoa
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public List<Endereco> getEnderecos() {
    	return this.enderecos;
    }
    
    public void setEnderecos(List<Endereco> enderecos) {
    	this.enderecos = enderecos;
    }
    
    public List<Telefone> getTelefones() {
    	return this.telefones;
    }
    
    public void setTelefones(List<Telefone> telefones) {
    	this.telefones = telefones;
    }
}
