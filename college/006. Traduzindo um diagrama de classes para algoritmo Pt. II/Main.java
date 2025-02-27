public class Main {
    public static void main(String[] args) {
    	// instanciando um catálogo
        Catalogo catalogo = new Catalogo();
        
        // instanciando veículos de diferentes subclasses
        Veiculo carro1 = new Carro(1, new Modelo(1, "Fiesta"), new Marca(1, "Ford"), 2008, 4, 5, 115f);
        Veiculo carro2 = new Carro(2, new Modelo(2, "Civic"), new Marca(2, "Honda"), 2015, 4, 5, 155f);
        Veiculo carro3 = new Carro(3, new Modelo(3, "Agile"), new Marca(3, "Chevrolet"), 2012, 4, 5, 102f);
        Veiculo caminhao1 = new Caminhao(4, new Modelo(4, "FH"), new Marca(4, "Volvo"), 2022, 3);
        Veiculo caminhao2 = new Caminhao(5, new Modelo(5, "Actros"), new Marca(5, "Mercedes-Benz"), 2019, 3);
        Veiculo onibus1 = new Onibus(6, new Modelo(6, "Citywide"), new Marca(6, "Scania"), 2021, 50, true);
        
        // adicionando veículos ao catálogo
        catalogo.addVeiculo(carro1);
        catalogo.addVeiculo(carro2);
        catalogo.addVeiculo(carro3);
        catalogo.addVeiculo(caminhao1);
        catalogo.addVeiculo(caminhao2);
        catalogo.addVeiculo(onibus1);
        
        // imprimindo o catálogo inteiro
        catalogo.imprimir();
        
        System.out.println("========================");
        
        // consultando os dados de um veículo pelo seu código
        Veiculo v = catalogo.consultar(4);
        v.imprimir();
    }
}