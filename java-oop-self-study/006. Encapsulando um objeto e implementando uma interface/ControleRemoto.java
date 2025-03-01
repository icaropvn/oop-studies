public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	private int volumeAntesMudo;
	
	// construtor de ControleRemoto
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
		this.volumeAntesMudo = 50;
	}
	
	// métodos específicos de ControleRemoto
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if(!this.isLigado())
			return;
		
		System.out.println("---- MENU ----");
		System.out.println("Está ligado? " + this.isLigado());
		System.out.println("Está tocando? " + this.isTocando());
		System.out.println("Volume: " + this.getVolume());
		
		for(int i=0; i<10; i++) {
			System.out.print(i < (this.getVolume() / 10) ? "|" : "·");
		}
		
		System.out.println("");
	}

	@Override
	public void fecharMenu() {
		if(!this.isLigado())
			return;
		
		System.out.println("Fechando menu...");
	}

	@Override
	public void maisVolume() {
		if(this.isLigado() && this.getVolume() < 100)
			this.setVolume(getVolume() + 1);
	}

	@Override
	public void menosVolume() {
		if(this.isLigado() && this.getVolume() > 0)
			this.setVolume(getVolume() - 1);
	}

	@Override
	public void ligarMudo() {
		if(this.isLigado() && this.getVolume() > 0) {
			this.setVolumeAntesMudo(this.getVolume());
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if(this.isLigado() && this.getVolume() == 0)
			this.setVolume(this.getVolumeAntesMudo());
	}

	@Override
	public void play() {
		if(this.isLigado() && !this.isTocando())
			this.setTocando(true);
	}

	@Override
	public void pause() {
		if(this.isLigado() && this.isTocando())
			this.setTocando(false);
	}
	
	// getters e setters de ControleRemoto
	public int getVolume() {
		return this.volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public boolean isLigado() {
		return this.ligado;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	public int getVolumeAntesMudo() {
		return volumeAntesMudo;
	}

	public void setVolumeAntesMudo(int volumeAntesMudo) {
		this.volumeAntesMudo = volumeAntesMudo;
	}
}