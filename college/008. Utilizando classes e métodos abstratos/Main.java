public class Main {
    public static void main(String[] args) {
    	Horista horista = new Horista(1, "João", 3300.00f, 160, 20);
    	Comissionado comissionado = new Comissionado(2, "Maria", 500.00f, 10000.00f);
    	Mensalista mensalista = new Mensalista(3, "Pedro", 3000.00f, 10);
    	
    	System.out.println("Salário final do horista João: R$" + String.format("%.2f", horista.getSalarioFinal()));
    	System.out.println("Salário final da comissionada Maria: R$" + String.format("%.2f", comissionado.getSalarioFinal()));
    	System.out.println("Salário final do mensalista Pedro: R$" + String.format("%.2f", mensalista.getSalarioFinal()));
    }
}