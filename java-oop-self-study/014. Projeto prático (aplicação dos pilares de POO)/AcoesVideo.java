public interface AcoesVideo {
	/*
	 * não é necessário colocar "public abstract" nos métodos,
	 * pois isso já é implícito. O código pode ficar redundante
	 * e poluído.
	*/
	
	void play();
	void pause();
	void like();
	void maisUmaVisualizacao();
}