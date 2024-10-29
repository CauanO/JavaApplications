import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Voce deseja ver a tabuada? (S = Sim) ou (N = Não): ");
        String opcao = sc.nextLine();
        switch (opcao) {
            case "S":
                do {
                    System.out.println("Digite um numero > 1 e < 11: ");
                    numero = sc.nextInt();
                    if (numero < 1 || numero > 11) {
                        System.out.println("Digite um valor correto");
                    }
                } while (numero < 1 || numero > 11);
                resultado(numero);
                break;
            case "N":
                System.out.println("Progama encerrado!");
                break;
            default:
                System.out.println("DIgite um valor valido!");
                break;
        }
    }

    public static void resultado(int a) {
        for (int i = 1; i <= 10; i++) {
            int resultTabuada = i * a;
            System.out.println(a + " X " + i + " = " + resultTabuada);
        }

    }
}
