import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();

        if (num1 == 0) {
            System.out.println("É ZERO");
        } else if (num1 > 0) {
            System.out.println("O número é POSITIVO");
        } else {
            System.out.println("O número é NEGATIVO");
        }
    }
}