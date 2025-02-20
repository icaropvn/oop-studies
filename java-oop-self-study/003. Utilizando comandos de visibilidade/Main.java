public class Main {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		// alterando atributos públicos
		c1.modelo = "Pentel Energel";
		c1.cor = "Preta";
		
		// c1.ponta = 0.5f;			o atributo PONTA da classe Caneta é privado, ou seja, não é acessível a partir da classe Main
		
		// alterando atributos protegidos
		c1.carga = 60; //			atributos protegidos estão sendo alterados, pois estamos usando uma classe (Main) que internamente chama a classe Caneta
		c1.tampada = true;
		
		c1.status();
	}
}
