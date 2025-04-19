import java.time.LocalDate;

public class Professor extends Pessoa {
	private String formacao;
	private String area;
	private LocalDate anoAdmissao;
	private int quantidadeHoras;
	
	public Professor(String formacao, String area, LocalDate anoAdmissao, int quantidadeHoras) {
		this.formacao = formacao;
		this.area = area;
		this.anoAdmissao = anoAdmissao;
		this.quantidadeHoras = quantidadeHoras;
	}
	
	// getters e setters
	public String getFormacao() {
		return formacao;
	}
	
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public String getArea() {
		return area;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public LocalDate getAnoAdmissao() {
		return anoAdmissao;
	}
	
	public void setAnoAdmissao(LocalDate anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}
	
	public int getQuantidadeHoras() {
		return quantidadeHoras;
	}
	
	public void setQuantidadeHoras(int quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}
	
	// métodos específicos
	public void cadastrar() {
		// realizar cadastro de Professor
	}
	
	public void imprimir() {
		System.out.println("Nome: " + super.getNome() +
						   "\nFormação: " + getFormacao() +
						   "\nÁrea: " + getArea() +
						   "\nAno de admissão: " + getAnoAdmissao() +
						   "\nQuantidade de horas: " + getQuantidadeHoras());
	}
}