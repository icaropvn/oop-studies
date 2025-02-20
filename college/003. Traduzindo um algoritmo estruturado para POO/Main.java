public class Main {
    public static void main(String[] args) {
        Pessoa albertEinstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa isaacNewton = new Pessoa("Isaac Newton", 4, 1, 1643);

        System.out.println("Idade de " + albertEinstein.informaNome() + " em 2025: " + albertEinstein.calculaIdade());
        System.out.println("Idade de " + isaacNewton.informaNome() + " em 2025: " + isaacNewton.calculaIdade());
    }
}