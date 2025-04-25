import javax.swing.JOptionPane;

public class Administrativo extends Funcionario {
	private String descCargo;
	private String descArea;
	
	public Administrativo() {
		super();
	}
	
	public Administrativo(String descCargo, String descArea) {
		this.descCargo = descCargo;
		this.descArea = descArea;
	}

	public String getDescCargo() {
		return descCargo;
	}

	public void setDescCargo(String descCargo) {
		this.descCargo = descCargo;
	}

	public String getDescArea() {
		return descArea;
	}

	public void setDescArea(String descArea) {
		this.descArea = descArea;
	}
	
	public void cadastrar() {
		setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Insira o código do funcionário:")));
		setNome(JOptionPane.showInputDialog("Insira o nome do funcionário:"));
		setMatricula(JOptionPane.showInputDialog("Insira o código de matrícula do funcionário:"));
		setCtps(JOptionPane.showInputDialog("Insira o CTPS do funcionário:"));
		setDescCargo(JOptionPane.showInputDialog("Insira o cargo do funcionário:"));
		setDescArea(JOptionPane.showInputDialog("Insira a área do funcionário:"));
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("Cargo: " + getDescCargo());
		System.out.println("Área: " + getDescArea());
	}
}