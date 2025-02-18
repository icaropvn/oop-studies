public class Garrafa {
	String cor;
	String material;
	int capacidadeTotal;
	int volumeAtual;
	boolean fechada;
	boolean termica;
	
	void abrir() {
		this.fechada = false;
	}
	
	void fechar() {
		this.fechada = true;
	}
	
	void beber(int porcentagem) {
		if(this.fechada == false) {
			if(this.volumeAtual - porcentagem > 0)
				this.volumeAtual -= porcentagem;
			else
				this.volumeAtual = 0;
		}
		else
			System.out.println("Não posso tomar nada com a garrafa fechada.");
	}
	
	void encher() {
		if(this.fechada == false)
			this.volumeAtual = 100;
		else
			System.out.println("Não posso encher a garrafa fechada.");
	}
	
	void esvaziar() {
		if(this.fechada == false)
			this.volumeAtual = 0;
		else
			System.out.println("Não posso esvaziar a garrafa fechada.");
	}
}
