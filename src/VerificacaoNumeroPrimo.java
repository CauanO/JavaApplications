import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n = sc.nextInt();
        if (validacao(n)) {
            System.out.println("Primo");
        } else {
            System.out.println("Não primo");
        }
    }

    public static boolean validacao(int a) {
        if (a < 2) {
            return false;
        }else if (a > 2 && a % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= a; i += 2) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
