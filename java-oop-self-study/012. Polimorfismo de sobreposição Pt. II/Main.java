public class Main {
	public static void main(String[] args) {
        Mamifero mam = new Mamifero();
        Lobo lobo = new Lobo();
        Cachorro c = new Cachorro();
        
        System.out.println("====== Exemplo de uso de sobreposição (@Override) ======");
        System.out.println("");
        
        System.out.println("Usando emitirSom() em Mamifero:");
        mam.emitirSom();
        System.out.println("");
        
        System.out.println("Usando emitirSom() em Lobo:");
        lobo.emitirSom();
        System.out.println("");
        
        System.out.println("Usando emitirSom() em Cachorro:");
        c.emitirSom();
	}
}
