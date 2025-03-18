public class Bolsista extends Aluno {
	private float bolsa;
	
	// construtor
	public Bolsista(String nome, int idade, String sexo, int matricula, String curso, float bolsa) {
		super(nome, idade, sexo, matricula, curso);
		this.bolsa = bolsa;
	}
	
	// métodos específicos
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println("Aluno bolsista. Realizando pagamento facilitado de " + getNome());
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nBolsa: " + getBolsa() + "%";
	}
	
	// getters e setters
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
}
