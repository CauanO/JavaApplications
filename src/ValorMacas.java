import java.util.Scanner;

public class ValorMacas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de maçãs desejadas: ");
        int qtdMacas = sc.nextInt();
        if (qtdMacas < 12) {
            double totalAbaixo = qtdMacas * 0.30;
            System.out.printf("Quantidade de maçãs: %d, Valor: %.2f", qtdMacas, totalAbaixo);
        } else {
            double totalAcima = qtdMacas * 0.25;
            System.out.printf("Quantidade de maçãs: %d, Valor: %.2f", qtdMacas, totalAcima);
        }
    }
}
