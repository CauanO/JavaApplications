import java.util.Scanner;

public class Divisibilidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int n2 = sc.nextInt();
        int total = n1 % n2;
        int totalDivisao = n1 / n2;
        if (total == 0) {
            System.out.printf("Numero 1 é divisivel por Numero 2, Resto: %d, Resultado: %d", total, totalDivisao);
        } else {
            System.out.printf("Numero 1 não é divisivel pelo Numero 2, Resto da divisão: %d", total);
        }
    }
}
