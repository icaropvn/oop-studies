public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Cor da caneta: " + this.cor);
		System.out.println("Ela está: " + (this.tampada == true ? "tampada" : "destampada"));
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga + "%");
	}
	
	void rabiscar() {
		if(this.tampada)
			System.out.println("Eu não posso rabiscar com a caneta tampada...");
		else
			System.out.println("Rabiscando...");
	}
	
	void tampar() {
		this.tampada = true; // this é uma referência ao próprio objeto que chamou o método
	}
	
	void destampar() {
		this.tampada = false;
	}
	
	void abastecer() {
		this.carga = 100;
	}
}
