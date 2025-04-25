import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ListaPessoa lista = new ListaPessoa(10);
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU\n" +
                "1 - Adicionar Aluno\n" +
                "2 - Adicionar Professor\n" +
                "3 - Adicionar Administrativo\n" +
                "4 - Listar Pessoas\n" +
                "5 - Remover Pessoa\n" +
                "0 - Sair"
            ));

            switch (opcao) {
                case 1:
                    Aluno aluno = new Aluno();
                    aluno.cadastrar();
                    if (lista.adicionar(aluno)) {
                        JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar aluno (lista cheia).");
                    }
                    break;

                case 2:
                    Professor professor = new Professor();
                    professor.cadastrar();
                    if (lista.adicionar(professor)) {
                        JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar professor (lista cheia).");
                    }
                    break;

                case 3:
                    Administrativo admin = new Administrativo();
                    admin.cadastrar();
                    if (lista.adicionar(admin)) {
                        JOptionPane.showMessageDialog(null, "Administrativo cadastrado com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar administrativo (lista cheia).");
                    }
                    break;

                case 4:
                	System.out.println();
                	System.out.println("===== Pessoas na lista =====");
                    lista.listar();
                    System.out.println("============================");
                    break;

                case 5:
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da pessoa a remover:"));
                    if (lista.remover(codigo)) {
                        JOptionPane.showMessageDialog(null, "Pessoa removida com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
                    }
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }

        } while (opcao != 0);
    }
}
