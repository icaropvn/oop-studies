public class Visitante extends Pessoa {
	/*
	 * essa é uma herança pobre (herança de implementação)
	 * o objetivo dela é que seja possível instanciar a classe
	 * sem adicionar nada novo
	*/
	
	// construtor
	public Visitante(String nome, int idade, String sexo) {
		super(nome, idade, sexo);
	}
}