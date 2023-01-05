import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();

        System.out.println("Digite sua nota:");
        float nota = scan.nextFloat();

        System.out.printf("A nota de %s é %.2f\n", nome, nota);
    }
}
