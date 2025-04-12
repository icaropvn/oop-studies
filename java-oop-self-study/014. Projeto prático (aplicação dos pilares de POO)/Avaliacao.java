public class Avaliacao {
	private int nota;
	private String comentario;
	
	public Avaliacao(int nota, String comentario) {
		this.nota = nota;
		this.comentario = comentario;
	}
	
	// getters e setters
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}