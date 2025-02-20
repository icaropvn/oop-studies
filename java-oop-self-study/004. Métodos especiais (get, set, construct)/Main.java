public class Main {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		// observando os valores padrões do método construtor
		System.out.println("Modelo padrão: " + c1.getModelo());
		System.out.println("Ponta padrão: " + c1.getPonta());
		
		// utilizando SETTERS para inserir valores nos atributos de Caneta
		c1.setModelo("Pentel Energel");
		c1.setPonta(0.7f);
		
		// utilizando GETTERS para recuperar valores dos atributos de Caneta
		System.out.println("\nModelo da caneta: " + c1.getModelo());
		System.out.println("Ponta da caneta: " + c1.getPonta());
	}
}