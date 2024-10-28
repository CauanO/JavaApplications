import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = sc.nextInt();
        System.out.println("Digite a opção onde, 1. Adição, 2. Subtração, 3. Multiplicação, 4. Divisão: ");
        String operacao = sc.next();
        int total;
        switch (operacao) {
            case "1" :
                total = a + b;
                System.out.println("Soma: " + total);
                break;
            case "2" :
                total = a - b;
                System.out.println("Subtração: " + total);
                break;
            case "3" : 
                total = a * b;
                System.out.println("Multiplicação: " + total);
                break;
            case "4":
                total = a / b;
                System.out.println("Divisão: " + total);
                break;
            default:
                System.out.println("Digite um Operação valida!");
        }
    }
}
