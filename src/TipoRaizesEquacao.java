import java.util.Scanner;

public class TipoRaizesEquacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a == 0) {
            System.out.println("Esse coeficiente tem que ser diferente de 0");
        } else if ((b * b) - (4 * a * c) > 0) {
            System.out.println("Existem duas raízes reais e diferentes");
        } else if ((b * b) - (4 * a * c) == 0) {
            System.out.println("Existe uma raiz real dupla (as duas raízes são iguais).");
        } else {
            System.out.println("Não existem raízes reais");
        }
    }
}
