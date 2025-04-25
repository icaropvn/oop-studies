public class ListaPessoa implements Ipessoa {
	private Pessoa[] listaPessoas;
	private int tamanho;
	
	public ListaPessoa(int tamanho) {
		listaPessoas = new Pessoa[tamanho];
		this.tamanho = tamanho;
	}
	
	public boolean adicionar(Pessoa pessoa) {
		for(int i=0; i<tamanho; i++) {
			if(listaPessoas[i] == null) {
				listaPessoas[i] = pessoa;
				return true;
			}
		}
		
		return false;
	}
	
	public boolean remover(int codigo) {
		for(int i=tamanho-1; i>=0; i++) {
			if(listaPessoas[i] != null && listaPessoas[i].getCodigo() == codigo) {
				listaPessoas[i] = null;
				return true;
			}
		}
		
		return false;
	}
	
	public void listar() {
		if(listaPessoas[0] == null) {
			System.out.println("Não há pessoas na lista.");
			return;
		}
		
		for(int i=0; i<tamanho; i++) {
			if(listaPessoas[i] != null) {
				System.out.println("Pessoa " + (i+1));
				listaPessoas[i].mostrar();
				System.out.println();
			}
		}
	}
}