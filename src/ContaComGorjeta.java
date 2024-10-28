import java.util.Scanner;

public class ContaComGorjeta {
    public static void main(String[] args) {
        double valor, valorGorjeta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da conta total: ");
        valor = sc.nextDouble();
        valorGorjeta = valor + (valor*0.1);
        System.out.println("Valor com os 10%: " + valorGorjeta);
        System.out.println("Valor sem a gorjeta: " + valor);
    }
}
