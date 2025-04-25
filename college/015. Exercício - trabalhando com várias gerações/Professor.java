import javax.swing.JOptionPane;

public class Professor extends Funcionario {
	private String titulo;
	
	public Professor() {
		super();
	}
	
	public Professor(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void cadastrar() {
		setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o código do professor:")));
		setNome(JOptionPane.showInputDialog("Insira o nome do professor:"));
		setMatricula(JOptionPane.showInputDialog("Insira o código de matrícula do professor:"));
		setCtps(JOptionPane.showInputDialog("Insira o CTPS do professor:"));
		setTitulo(JOptionPane.showInputDialog("Insira o título do professor:"));
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("Título: " + getTitulo());
	}
}