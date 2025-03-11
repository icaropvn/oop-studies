public class Main {
    public static void main(String[] args) {
        Lutador[] lutadores;
        lutadores = new Lutador[6];
        
        lutadores[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        lutadores[2] = new Lutador("Snapshadow", "Estados Unidos", 35, 1.65f, 80.9f, 12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        lutadores[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        lutadores[5] = new Lutador("Nerdaard", "Estados Unidos", 30, 1.81f, 105.7f, 12, 2, 4);
        
        System.out.println("Apresentando lutador 0:");
        lutadores[0].apresentar();
        System.out.println("---------------------------");
        
        System.out.println("Status do lutador 2:");
        lutadores[2].status();
        System.out.println("---------------------------");
        
        System.out.println("Categoria do lutador 3:");
        System.out.println(lutadores[3].getCategoria());
        System.out.println("---------------------------");
        
        System.out.println("Status do lutador 1 após ganhar luta:");
        lutadores[1].ganharLuta();
        lutadores[1].status();
        System.out.println("---------------------------");
        
        System.out.println("Status do lutador 0 após empatar luta:");
        lutadores[0].empatarLuta();
        lutadores[0].status();
        
        System.out.println("\n==========================================\n");
        
        System.out.println("Realizando uma luta:\n");
        
        Luta uec01 = new Luta();
        
        uec01.marcarLuta(lutadores[5], lutadores[4]);
        uec01.lutar();
    }
}