import java.time.LocalTime;

public class Cachorro extends Lobo {
	@Override
	public void emitirSom() {
		System.out.println("Au! Au!");
	}
	
	// exemplo de polimorfismo de sobrecarga do método reagir()
	
	public void reagir(String frase) {
		if(frase.equals("Vamos papar?") || frase.equals("Cheguei!"))
			System.out.println("O cachorro está abanando o rabo de felicidade. Ele mal consegue conter seus latidos de contentamento.");
		else
			System.out.println("O cachorro rosna para você.");
	}
	
	public void reagir(LocalTime horaDoDia) {
		if(horaDoDia.isBefore(LocalTime.of(12, 00)))
			System.out.println("O cachorro abana o rabo de felicidade.");
		else if(horaDoDia.isBefore(LocalTime.of(18, 00)))
			System.out.println("O cachorro parece muito feliz. Ele late descontroladamente e abana o rabo com força, demonstrando felicidade com a tua presença.");
		else
			System.out.println("O cachorro não parece interessado. Ele te ignora.");
	}
	
	public void reagir(boolean isDono) {
		if(isDono)
			System.out.println("O cachorro está muito feliz com a sua presença! Afinal, você é o dono dele!");
		else
			System.out.println("O cachorro está desconfiado. Você não parece o dono dele. Quem é você afinal?");
	}
	
	public void reagir(int idade, float peso) {
		if(idade < 5) {
			if(peso < 10)
				System.out.println("O cachorro parece feliz. Ele abana o rabo com vontade.");
			else
				System.out.println("O cachorro late. Ele parece feliz na verdade.");
		}
		else {
			if(peso < 10)
				System.out.println("O cachorro rosna. É melhor deixá-lo quieto.");
			else
				System.out.println("O cachorro não parece se incomodar com a sua presença. Ele sequer a notou na verdade.");
		}
	}
}