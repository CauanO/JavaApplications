import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        double c, f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em centígrados: ");
        c = sc.nextDouble();
        f = ((9*c)+160)/5;
        System.out.println("Temperatura em fahrenheit: " + f);
    }
}
