public class Mensalista extends Funcionario {
	private float horasExtras;
	
	// construtores
	public Mensalista(int matricula, String nome, float salario, float horasExtras) {
		super(matricula, nome, salario);
		this.horasExtras = horasExtras;
	}
	
	public Mensalista() {
		super();
	}
	
	// métodos específicos
	public float getSalarioFinal() {
		float valorHorasExtras = this.getSalario() / 220 * 1.5f;
			
		return (this.getSalario() + this.horasExtras * valorHorasExtras);
	}
	
	// getters e setters
	public float getHorasExtras() {
		return this.horasExtras;
	}
	
	public void setHorasExtras(float horasExtras) {
		this.horasExtras = horasExtras;
	}
}
