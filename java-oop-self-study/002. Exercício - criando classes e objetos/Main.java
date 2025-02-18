public class Main {
	public static void main(String[] args) {
		// instanciando uma garrafa
		Garrafa garrafa1 = new Garrafa();
		
		garrafa1.cor = "preto";
		garrafa1.material = "metal";
		garrafa1.capacidadeTotal = 700;
		garrafa1.volumeAtual = 0;
		garrafa1.fechada = true;
		garrafa1.termica = true;
		
		System.out.println("Tentando beber com a garrafa fechada:");
		garrafa1.beber(30);
		
		System.out.println("\n*Abrindo e enchendo a garrafa*");
		garrafa1.abrir();
		garrafa1.encher();
		System.out.println("Volume atual: " + garrafa1.volumeAtual);
		
		garrafa1.beber(20);
		System.out.println("Volume depois de beber: " + garrafa1.volumeAtual);
		
		System.out.println("\n=====================================");
		
		// instanciando um evento
		Evento e1 = new Evento();
		
		e1.definirNome("Consulta Médico");
		e1.definirDescricao("Consulta com ortopedista para ver a dor nas costas.");
		e1.definirCategoria("Compromisso");
		e1.definirHora(14, 0);
		e1.definirData(2025, 3, 7);
		
		e1.status();
	}
}
