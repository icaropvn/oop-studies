public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("AAP2367", 2016);
        Caminhao caminhao = new Caminhao("UMP9947", 2012, 3);
        Onibus onibus = new Onibus("FNF5036", 2021, 42);

        veiculo.exibirDados();
        System.out.println();
        caminhao.exibirDados();
        System.out.println();
        onibus.exibirDados();
    }
}