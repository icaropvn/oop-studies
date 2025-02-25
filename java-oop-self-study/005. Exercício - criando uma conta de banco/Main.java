public class Main {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco(001, "Jubileu Fernandes de Carlos");
        ContaBanco conta2 = new ContaBanco(002, "Creusa Silva Amorim");
        
        conta1.abrirConta("CP");
        conta2.abrirConta("CC");
        
        System.out.println("Jubileu: R$" + conta1.getSaldo());
        System.out.println("Creusa: R$" + conta2.getSaldo());
        
        conta1.sacar(50);;
        conta2.depositar(50);
        
        System.out.println("=============================");
        System.out.println("Jubileu: R$" + conta1.getSaldo());
        System.out.println("Creusa: R$" + conta2.getSaldo());
        
        conta1.pagarMensalidade();
        conta2.pagarMensalidade();
        
        System.out.println("=============================");
        System.out.println("Jubileu: R$" + conta1.getSaldo());
        System.out.println("Creusa: R$" + conta2.getSaldo());
    }
}