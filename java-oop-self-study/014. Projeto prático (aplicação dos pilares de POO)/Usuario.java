public class Usuario extends Pessoa {
	private String login;
	private int totalAssistido;
	
	public Usuario(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		
		this.login = login;
		totalAssistido = 0;
	}
	
	// getters e setters
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotalAssistido() {
		return totalAssistido;
	}

	public void setTotalAssistido(int totalAssistido) {
		this.totalAssistido = totalAssistido;
	}
	
	// métodos específicos
	public void viuMaisUm() {
		setTotalAssistido(getTotalAssistido() + 1);
	}
}