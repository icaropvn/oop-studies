public interface Ipessoa {
	/* as definições "public" e "abstract" são implícitas
	 * no funcionamento de interfaces em Java, então é
	 * redundante menciona-las em código
	*/
	
	boolean adicionar(Pessoa pessoa);
	boolean remover(int codigo);
	void listar();
}
