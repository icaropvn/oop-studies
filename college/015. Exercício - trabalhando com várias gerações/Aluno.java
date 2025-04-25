import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
	private String ra;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String ra) {
		this.ra = ra;
	}
	
	public String getRa() {
		return ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public void cadastrar() {
		setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o código do aluno:")));
		setNome(JOptionPane.showInputDialog("Insira o nome do aluno:"));
		setRa(JOptionPane.showInputDialog("Insira o RA do aluno:"));
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("RA: " + getRa());
	}
}