import java.util.Locale;
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("1: Masculino | 2: Feminino");
        int sexo = sc.nextInt();
        System.out.println("Digite sua altura: ");
        float altura = sc.nextFloat();
        if (sexo == 1) {
            double pesoIdealMasculino = (altura * 72.7) - 58;
            System.out.printf("Peso ideal Masculino: %.2f", pesoIdealMasculino);
        } else {
            double pesoIdealFeminino = (altura * 62.1) - 44.7;
            System.out.printf("Peso ideal Feminino: %.2f", pesoIdealFeminino);
        }
    }
}
