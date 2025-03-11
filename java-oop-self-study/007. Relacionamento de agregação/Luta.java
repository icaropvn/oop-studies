public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	// construtor
	public Luta(){}
	
	// métodos específicos
	public void marcarLuta(Lutador desafiante, Lutador desafiado) {
		if(desafiante.getCategoria() == desafiado.getCategoria() && desafiante != desafiado) {
			this.setAprovada(true);
			this.setDesafiado(desafiado);
			this.setDesafiante(desafiante);
			return;
		}
		
		this.setAprovada(false);
		this.setDesafiado(null);
		this.setDesafiante(null);
	}
	
	public void lutar() {
		if(this.isAprovada()) {
			System.out.println("### DESAFIADO ###");
			desafiado.apresentar();
			System.out.println("\n### DESAFIANTE ###");
			desafiante.apresentar();
			System.out.println();
			
			int vencedor = (int)(Math.random() * 3);
			
			switch(vencedor) {
				case 0:
					System.out.println("A luta empatou!");
					desafiado.empatarLuta();
					desafiante.empatarLuta();
					System.out.println();
					desafiado.status();
					System.out.println();
					desafiante.status();
					break;
				case 1:
					System.out.println("O desafiado " + desafiado.getNome() + " ganhou a luta!");
					desafiado.ganharLuta();
					desafiante.perderLuta();
					System.out.println();
					desafiado.status();
					break;
				case 2:
					System.out.println("O desafiante " + desafiante.getNome() + " ganhou a luta!");
					desafiado.perderLuta();
					desafiante.ganharLuta();
					System.out.println();
					desafiante.status();
					break;
			}
			
			return;
		}
		
		System.out.println("A luta não está aprovada, então ela não pode acontecer.");
	}
	
	// getters e setters
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	
	public Lutador getDesafiante(Lutador desafiante) {
		return this.desafiante;
	}
	
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	
	public int getRounds() {
		return this.rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return this.aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}