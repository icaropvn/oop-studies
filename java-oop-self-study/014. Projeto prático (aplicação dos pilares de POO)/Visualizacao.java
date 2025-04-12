public class Visualizacao {
	private Usuario espectador;
	private Video video;
	
	public Visualizacao(Usuario espectador, Video video) {
		this.espectador = espectador;
		this.video = video;
		
		espectador.viuMaisUm();
		video.maisUmaVisualizacao();
	}
	
	// getters e setters
	public Usuario getEspectador() {
		return espectador;
	}

	public void setEspectador(Usuario espectador) {
		this.espectador = espectador;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}
	
	// métodos específicos
	public void avaliar(int nota) {
		if(!validarNota(nota))
			return;
		
		Avaliacao novaAvaliacao = new Avaliacao(nota, "");
		video.adicionarAvaliacao(novaAvaliacao);
	}
	
	public void avaliar(int nota, String comentario) {
		if(!validarNota(nota))
			return;
		
		Avaliacao novaAvaliacao = new Avaliacao(nota, comentario);
		video.adicionarAvaliacao(novaAvaliacao);
	}
	
	public boolean validarNota(int nota) {
		if(nota < 1 || nota > 5) {
			System.out.println("Nota de avaliação inválida.");
			return false;
		}
		
		return true;
	}
}