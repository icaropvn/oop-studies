public class Onibus extends Veiculo {
    private int assentos;

    // construtor
    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    // métodos específicos
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Assentos: " + getAssentos());
    }

    // getters e setters
    public int getAssentos() {
        return this.assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
}
