import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA - Java Edition");

        System.out.println("Insira o primeiro número: ");
        float num1 = scanner.nextFloat();

        System.out.println("Insira o segundo número: ");
        float num2 = scanner.nextFloat();

        System.out.println("Insira a operação:\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        int operacao = scanner.nextInt();

        float result = 0;
        boolean operacaoBemSucedida = false;

        switch (operacao) {
            case 1:
                result = num1 + num2;
                operacaoBemSucedida = true;
                break;
            case 2:
                result = num1 - num2;
                operacaoBemSucedida = true;
                break;
            case 3:
                result = num1 * num2;
                operacaoBemSucedida = true;
                break;
            case 4:
                if(num2 != 0) {
                    result = num1 / num2;
                    operacaoBemSucedida = true;
                }
                break;
        }

        if(operacaoBemSucedida) {
            System.out.format("\n%f", result);
        }
        else {
            System.out.println("\nErro.");
        }
    }
}