public interface Colecao {
	public abstract boolean inserir(Pessoa p);
	public abstract boolean remover();
	public abstract boolean atualizar(Pessoa p);
	public abstract boolean pesquisar(Pessoa p);
	public abstract Pessoa pesquisar(int indice);
}