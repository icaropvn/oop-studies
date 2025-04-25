import javax.swing.*;

public abstract class Pessoa {
	private int codigo;
	private String nome;
	
	public Pessoa(){}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void mostrar() {
		System.out.println("Código: " + getCodigo());
		System.out.println("Nome: " + getNome());
	}
	
	public abstract void cadastrar();
}