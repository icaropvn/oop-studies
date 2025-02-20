public class Caneta {
	// atributos privados (encapsulados)
	private String modelo;
	private float ponta;
	
	// método construtor
	public Caneta() {
		this.modelo = "Modelo desconhecido";
		this.ponta = 0;
	}
	
	// métodos acessores e modificadores
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
}