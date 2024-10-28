import java.util.Locale;
import java.util.Scanner;

public class ClassificacaoPesoAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        if (peso <= 60 && altura < 1.30) {
            System.out.println("A");
        } else if (peso <= 60 && altura >= 1.30 && altura < 1.70) {
            System.out.println("B");
        } else if (peso <= 60 && altura > 1.70) {
            System.out.println("C");
        } else if (peso > 60 && peso < 85 && altura < 1.30) {
            System.out.println("D");
        } else if (peso > 60 && peso < 85 && altura >= 1.30 && altura < 1.70) {
            System.out.println("E");
        } else if (peso > 60 && peso < 85 && altura > 1.70) {
            System.out.println("F");
        } else if (peso > 85 && altura < 1.30) {
            System.out.println("G");
        } else if (peso > 85 && altura >= 1.30 && altura < 1.70) {
            System.out.println("H");
        } else if (peso > 85 && altura > 1.70) {
            System.out.println("I");
        }
    }
}
