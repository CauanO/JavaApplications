import java.util.Scanner;

public class NumeroPositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n % 2) == 0) {
            if (n > 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }
            System.out.println("Número Par!");
        } else {
            if (n > 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }
            System.out.println("Número Ímpar!");
        }
    }
}
