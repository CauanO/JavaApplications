import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro valor: ");
        int n2 = sc.nextInt();
        boolean repMenu = true;
        while (repMenu) {
            System.out.println(
                    "Menu: \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n 5 - Trocar valores \n 6 - Sair ");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    soma(n1, n2);
                    break;
                case 2:
                    subtracao(n1, n2);
                    break;
                case 3:
                    multiplicacao(n1, n2);
                    break;
                case 4:
                    divisao(n1, n2);
                    break;
                case 5:
                    System.out.println("Digite um valor: ");
                    n1 = sc.nextInt();
                    System.out.println("Digite outro valor: ");
                    n2 = sc.nextInt();
                    break;
                case 6:
                System.out.println("Progama finalizado!");
                System.exit(0);
                    break;

                default:
                    System.out.println("Digite uma opção valida!");
                    break;
            }
        }
        System.out.println("Progama encerrado!");
        System.exit(0);
    }

    public static void soma(int a, int b) {
        int soma = a + b;
        System.out.println("Soma: " + a + " + " + b + " = " + soma);
    }

    public static void subtracao(int a, int b) {
        int subtracao = a - b;
        System.out.println("Subtração: " + a + " - " + b + " = " + subtracao);
    }

    public static void multiplicacao(int a, int b) {
        int multiplicacao = a * b;
        System.out.println("Multiplicação: " + a + " X " + b + " = " + multiplicacao);
    }

    public static void divisao(int a, int b) {
        int resto = a % b;
        int divisao = a / b;
        System.out.println("Divisão: " + a + " / " + b + " = " + divisao + ";" + " Onde á resto: " + resto);
    }
}
