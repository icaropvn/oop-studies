public class ColecaoVetor implements Colecao {
	private Pessoa[] dados = new Pessoa[50];
	
	public boolean inserir(Pessoa p) {
		for(int i=0; i<50; i++) {
			if(dados[i] == null) {
				dados[i] = p;
				return true;
			}
		}
		
		return false;
	}
	
	public boolean remover() {
		for(int i=49; i>-1; i--) {
			if(dados[i] != null) {
				dados[i] = null;
				return true;
			}
		}
		
		return false;
	}
	
	public boolean atualizar(Pessoa p) {
		for(int i=0; i<50; i++) {
			if(dados[i].getCpf().equals(p.getCpf())) {
				dados[i] = p;
				return true;
			}
		}
		
		return false;
	}
	
	public boolean pesquisar(Pessoa p) {
		for(int i=0; i<50; i++) {
			if(dados[i] == p)
				return true;
		}
		
		return false;
	}
	
	public Pessoa pesquisar(int indice) {
		return dados[indice];
	}
}