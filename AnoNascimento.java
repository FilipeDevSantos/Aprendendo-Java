import java.util.Calendar;
import java.util.Scanner;
public class AnoNascimento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("Digite seu ano de nascimento:");
        int ano = scan.nextInt();

        int idade = anoAtual - ano;
        System.out.println("A sua idade é: " + idade);
    }
}
