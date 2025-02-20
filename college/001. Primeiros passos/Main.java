import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Java!");
        System.out.println("Set value to >> x: ");
        int x = scanner.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.println("x: " + (x * i));
        }
    }
}