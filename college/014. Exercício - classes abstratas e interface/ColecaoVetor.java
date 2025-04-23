public class ColecaoVetor implements Colecao {
	private Pessoa[] dados;
	private int tamanho;
	
	public ColecaoVetor(int tamanho) {
		dados = new Pessoa[tamanho];
		this.tamanho = tamanho;
	}
	
	public boolean inserir(Pessoa p) {
		for(int i=0; i<tamanho; i++) {
			if(dados[i] == null) {
				dados[i] = p;
				return true;
			}
		}
		
		return false;
	}
	
	public boolean remover() {
		for(int i=tamanho-1; i>-1; i--) {
			if(dados[i] != null) {
				dados[i] = null;
				return true;
			}
		}
		
		return false;
	}
	
	public boolean atualizar(Pessoa p) {
		for(int i=0; i<tamanho; i++) {
			if(dados[i].getCpf().equals(p.getCpf())) {
				dados[i] = p;
				return true;
			}
		}
		
		return false;
	}
	
	public boolean pesquisar(Pessoa p) {
		for(int i=0; i<tamanho; i++) {
			if(dados[i] == p)
				return true;
		}
		
		return false;
	}
	
	public Pessoa pesquisar(int indice) {
		return dados[indice];
	}
}