import animais.*;
import mamiferos.*;
import repteis.*;
import peixes.*;
import aves.*;

public class Main {
	public static void main(String[] args) {
        Animal cachorro = new Cachorro(10.5f, 5, 4, "Caramelo");
        Animal canguru = new Canguru(50.3f, 7, 4, "Castanho");
        Animal arara = new Arara(1.5f, 3, 2, "Azul");
        Animal peixeDourado = new PeixeDourado(0.3f, 1, 0, "Dourado");
        Animal cobra = new Cobra(2.0f, 4, 0, "Verde");
        Animal tartaruga = new Tartaruga(10.0f, 50, 4, "Marrom");

        Animal[] animais = {cachorro, canguru, arara, peixeDourado, cobra, tartaruga};
        
        for (Animal animal : animais) {
            System.out.println("---------------------------------");
            animal.mostrarDados();
            animal.locomover();
            animal.alimentar();
            animal.emitirSom();
            System.out.println("---------------------------------\n");
        }

        ((Cachorro)cachorro).abanarRabo();
        ((Canguru)canguru).usarBolsa();
        ((Ave)arara).fazerNinho();
        ((Peixe)peixeDourado).soltarBolha();
	}
}
