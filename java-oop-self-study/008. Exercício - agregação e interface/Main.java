public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[3];
        
        pessoas[0] = new Pessoa("Jaderson", 23, "Masculino");
        pessoas[1] = new Pessoa("Yasmin", 28, "Não-binário");
        
        livros[0] = new Livro("O conde de Monte Cristo", "Alexandre Dumas", 1304, pessoas[1]);
        livros[1] = new Livro("Cem anos de solidão", "Gabriel García Márquez", 448, pessoas[0]);
        livros[2] = new Livro("O jogo do anjo", "Carlos Ruiz Zafón", 520, pessoas[1]);
        
        System.out.println(livros[0].detalhes());
        
        livros[0].abrir();
        livros[0].folhear(1300);
        livros[0].avancarPagina();
        
        System.out.println("\n" + livros[0].detalhes());
    }
}