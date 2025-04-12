import java.util.ArrayList;

public class Video implements AcoesVideo {
	private String titulo;
	private ArrayList<Avaliacao> avaliacoes;
	private int visualizacoes;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		this.titulo = titulo;
		avaliacoes = new ArrayList<>();
		visualizacoes = 0;
		curtidas = 0;
		reproduzindo = false;
	}
	
	// getters e setters
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public int getVisualizacoes() {
		return visualizacoes;
	}

	public void setVisualizacoes(int visualizacoes) {
		this.visualizacoes = visualizacoes;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	// métodos da interface implementados
	@Override
	public void play() {
		setReproduzindo(true);
	}
	
	@Override
	public void pause() {
		setReproduzindo(false);
	}
	
	@Override
	public void like() {
		setCurtidas(getCurtidas() + 1);
	}
	
	@Override
	public void maisUmaVisualizacao() {
		setVisualizacoes(getVisualizacoes() + 1);
	}
	
	public void adicionarAvaliacao(Avaliacao novaAvaliacao) {
		avaliacoes.add(novaAvaliacao);
	}
}