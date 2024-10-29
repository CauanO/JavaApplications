import java.util.Scanner;

public class CalculoMMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();
        int resultMmc = mmc(n1, n2);
        System.out.println("MMC de " + n1 + " e " + n2 + " é: " + resultMmc);
    }

    public static int mmc(int a, int b) {
        int mmc = a;
        while (mmc % b != 0) {
            mmc += a;
        }
        return mmc;
    }
}
