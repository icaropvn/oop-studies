public class ClassesEObjetos {
	public static void main(String[] args) {
		Caneta c1 = new Caneta(); // instanciando um objeto da classe Caneta
		
		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		
		System.out.println("Conferindo o estado da caneta:");
		c1.status();
		
		System.out.println("\nDepois de chamar o método \"tampar\":");
		c1.tampar();
		c1.status();
		
		System.out.println("\nTentando rabiscar com a caneta tampada:");
		c1.rabiscar();
		
		System.out.println("\nDestampando e rabiscando:");
		c1.destampar();
		c1.rabiscar();
		
		System.out.println("\n=============================================");
		System.out.println("Instanciando uma segunda caneta:");
		Caneta c2 = new Caneta();
		
		c2.modelo = "Pentel Energel";
		c2.cor = "vermelho";
		c2.ponta = 0.7f;
		c2.destampar();
		c2.status();
		
		System.out.println("\nAbastecendo a carga da caneta 2:");
		c2.abastecer(); // Atribuindo 100 de carga à caneta
		c2.status();
	}
}
