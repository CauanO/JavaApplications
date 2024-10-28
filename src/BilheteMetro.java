import java.util.Scanner;

public class BilheteMetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o tipo de bilhete desejado? \n 1. Bilhete Unitário (1) \n 2. Bilhete Duplo (2) \n 3. Bilhete de 10 viagens (3)");
        int opcao = sc.nextInt();
        System.out.println("Digite o valor a ser depositado: ");
        double valor = sc.nextDouble();
        double bilheteUnitario = 1.30;
        double bilheteDuplo = 2.60;
        double bilhete10 = 12.0;
        double total, troco;

        switch (opcao) {
            case 1:
                total = valor / bilheteUnitario;
                troco = valor % bilheteUnitario;
                System.out.printf("Quantidade de bilhetes: %.0f%n", total);
                System.out.printf("Troco: %.2f%n", troco);
                break;
            case 2:
                total = valor / bilheteDuplo;
                troco = valor % bilheteDuplo;
                System.out.printf("Quantidade de bilhetes: %.0f%n", total);
                System.out.printf("Troco: %.2f%n", troco);
                break;
            case 3:
                total = valor / bilhete10;
                troco = valor % bilhete10;
                System.out.printf("Quantidade de bilhetes: %.0f%n", total);
                System.out.printf("Troco: %.2f%n", troco);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
