import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        System.out.println("====== Exemplo de uso de sobrecarga ======");
        System.out.println("");
        
        c.reagir("Cheguei!");
        c.reagir("Não pode, James!");
        
        System.out.println("");
        
        c.reagir(LocalTime.of(11, 45));
        c.reagir(LocalTime.of(21, 10));
        
        System.out.println("");
        
        c.reagir(true);
        c.reagir(false);
        
        System.out.println("");
        
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
	}
}
