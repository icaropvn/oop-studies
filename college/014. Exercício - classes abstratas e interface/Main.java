import java.time.LocalDate;

/**
 * Classe de teste para o cenário Pessoa ↔ Professor ↔ Aluno + ColecaoVetor.
 * 
 * Como o método cadastrar() nas subclasses não possui
 * implementação, todos os campos são preenchidos manualmente via
 * construtores e setters. A ideia é testar as operações exigidas
 * pela interface Colecao (inserir, remover, atualizar, pesquisar).
 */
public class Main {
    public static void main(String[] args) {
        /*
         * -----------------------------------------------------------------
         * 1. Cria a coleção (capacidade 50) e alguns objetos de teste
         * -----------------------------------------------------------------
         */
        Colecao colecao = new ColecaoVetor();

        Professor prof1 = new Professor(
                "Engenharia da Computação",
                "Programação",
                LocalDate.of(2015, 3, 1),
                40);
        prof1.setNome("Alice Santos");
        prof1.setCpf("11111111111");
        prof1.setDataNascimento(LocalDate.of(1980, 5, 10));
        prof1.setTelefoneResidencial("(11) 4001‑1234");
        prof1.setNumeroCelular("(11) 99999‑1111");

        Professor prof2 = new Professor(
                "Matemática",
                "Álgebra Linear",
                LocalDate.of(2010, 2, 15),
                20);
        prof2.setNome("Bruno Oliveira");
        prof2.setCpf("22222222222");
        prof2.setDataNascimento(LocalDate.of(1975, 8, 22));
        prof2.setTelefoneResidencial("(21) 3003‑5678");
        prof2.setNumeroCelular("(21) 98888‑2222");

        Aluno aluno1 = new Aluno(
                "2023001",
                "Ciência da Computação",
                9.2,
                2023);
        aluno1.setNome("Carlos Pereira");
        aluno1.setCpf("33333333333");
        aluno1.setDataNascimento(LocalDate.of(2004, 1, 30));
        aluno1.setTelefoneResidencial("(31) 3222‑1010");
        aluno1.setNumeroCelular("(31) 97777‑3333");

        Aluno aluno2 = new Aluno(
                "2022007",
                "Engenharia Elétrica",
                8.5,
                2022);
        aluno2.setNome("Daniela Souza");
        aluno2.setCpf("44444444444");
        aluno2.setDataNascimento(LocalDate.of(2003, 11, 3));
        aluno2.setTelefoneResidencial("(41) 3322‑4545");
        aluno2.setNumeroCelular("(41) 96666‑4444");

        /*
         * -----------------------------------------------------------------
         * 2. Inserção dos objetos na coleção
         * -----------------------------------------------------------------
         */
        colecao.inserir(prof1);
        colecao.inserir(prof2);
        colecao.inserir(aluno1);
        colecao.inserir(aluno2);

        System.out.println("\n=== LISTA INICIAL ===");
        for (int i = 0; i < 4; i++) {
            colecao.pesquisar(i).imprimir();
            System.out.println();
        }

        /*
         * -----------------------------------------------------------------
         * 3. Pesquisa por objeto (baseada em referência)
         * -----------------------------------------------------------------
         */
        System.out.println("Objeto aluno1 está na coleção? " + colecao.pesquisar(aluno1));

        /*
         * -----------------------------------------------------------------
         * 4. Atualização: alterar o coeficiente de aluno1 e atualizar no vetor
         *    (o método ColecaoVetor.atualizar localiza por CPF)
         * -----------------------------------------------------------------
         */
        aluno1.setCoeficiente(9.6); // novo CR
        colecao.atualizar(aluno1);

        System.out.println("\n=== APÓS ATUALIZAR COEFICIENTE DE aluno1 ===");
        colecao.pesquisar(2).imprimir();

        /*
         * -----------------------------------------------------------------
         * 5. Remoção do último elemento (aluno2)
         * -----------------------------------------------------------------
         */
        colecao.remover();

        System.out.println("\n=== APÓS REMOVER O ÚLTIMO OBJETO ===");
        for (int i = 0; i < 4; i++) {
            Pessoa p = colecao.pesquisar(i);
            if (p != null) {
                p.imprimir();
                System.out.println();
            }
        }
    }
}
