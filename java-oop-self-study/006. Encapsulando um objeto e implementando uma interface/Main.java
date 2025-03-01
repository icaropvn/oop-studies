public class Main {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        
        System.out.println("Ligando a TV e mostrando o menu:");
        controle.ligar();
        controle.abrirMenu();
        System.out.println();
        
        System.out.println("Aumentando o volume em 15:");
        for(int i=0; i<15; i++)
        	controle.maisVolume();
        
        controle.abrirMenu();
        System.out.println();
        
        System.out.println("Mutando a TV:");
        controle.ligarMudo();
        controle.abrirMenu();
        System.out.println();
        
        System.out.println("Desmutando a TV:");
        controle.desligarMudo();
        controle.abrirMenu();
        System.out.println();
        
        System.out.println("Fechando o menu:");
        controle.fecharMenu();
        System.out.println();
        
        System.out.println("Dando play na TV:");
        controle.play();
        controle.abrirMenu();
        System.out.println();
        
        System.out.println("Pausando a TV:");
        controle.pause();
        controle.abrirMenu();
        System.out.println();
        
        System.out.println("Diminuindo o volume em 35:");
        for(int i=0; i<35; i++)
        	controle.menosVolume();
        controle.abrirMenu();
        System.out.println();
        
        System.out.println("Desligando a TV. (nada funciona)");
        controle.desligar();
        controle.abrirMenu();
        controle.maisVolume();
        controle.play();
    }
}