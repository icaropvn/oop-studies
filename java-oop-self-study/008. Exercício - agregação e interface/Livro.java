public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	// construtor
	public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.paginaAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}
	
	// métodos específicos
	public String detalhes() {
		return "Título: " + titulo + "\nAutor: " + autor + "\nTotal de páginas: " + totalPaginas + "\nPágina atual: " + paginaAtual + "\nAberto? " + aberto + "\nLeitor: " + leitor.getNome();
	}
	
	// métodos da interface
	@Override
	public void abrir() {
		setAberto(true);
	}
	
	@Override
	public void fechar() {
		setAberto(false);
		setPaginaAtual(0);
	}
	
	@Override
	public void folhear(int pagina) {
		if(pagina > getTotalPaginas() || pagina < 0 || !isAberto())
			return;
		
		setPaginaAtual(pagina);
	}
	
	@Override
	public void avancarPagina() {
		if(getPaginaAtual() < getTotalPaginas() && isAberto())
			setPaginaAtual(getPaginaAtual() + 1);
	}
	
	@Override
	public void voltarPagina() {
		if(getPaginaAtual() > 0 && isAberto())
			setPaginaAtual(getPaginaAtual() - 1);
	}
	
	// getters e setters
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getPaginaAtual() {
		return paginaAtual;
	}

	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
}