public class Caminhao extends Veiculo {
    private int eixos;

    // construtor
    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    // métodos específicos
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Eixos: " + getEixos());
    }

    // getters e setters
    public int getEixos() {
        return this.eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
}
