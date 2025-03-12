import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoSistema {
    public static void main(String[] args) {
    	Dimension resolucaoTela = Toolkit.getDefaultToolkit().getScreenSize();
    	int largura = (int)resolucaoTela.getWidth();
    	int altura = (int)resolucaoTela.getHeight();
    	
    	System.out.println("A resolução da tela é: " + largura + "px X " + altura + "px");
    }
}