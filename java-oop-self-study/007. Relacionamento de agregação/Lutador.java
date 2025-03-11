public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	// construtores de Lutador
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	public Lutador(){}
	
	// métodos específicos de Lutador
	public void apresentar() {
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Nacionalidade: " + this.getNacionalidade());
		System.out.println(this.getIdade() + " anos");
		System.out.println(this.getAltura() + "m de altura");
		System.out.println(this.getPeso() + "Kg");
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Vitórias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
	}
	
	public void status() {
		System.out.println(this.getNome());
		System.out.println("Categoria " + this.getCategoria());
		System.out.println(this.getVitorias() + " vitórias");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println(this.getEmpates() + " empates");
	}
	
	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
	}
	
	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}
	
	// getters e setters de Lutador
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}
	
	// método setter privado pois a categoria é automaticamente atualizada pelo sistema através do setPeso()
	private void setCategoria() {
		if(this.peso < 52.2 || this.peso > 120.2)
			this.categoria = "Inválido";
		else if(this.peso <= 70.3)
			this.categoria = "Leve";
		else if(this.peso <= 83.9)
			this.categoria = "Médio";
		else
			this.categoria = "Pesado";
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
}