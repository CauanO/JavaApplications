import java.util.Scanner;

public class VerificacaoTriangulo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int a = sc.nextInt();
        System.out.println("Digite outro valor: ");
        int b = sc.nextInt();
        System.out.println("Digite outro valor: ");
        int c = sc.nextInt();
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.println("É um triângulo!");
            if (a == b && b == c) {
                System.out.println("É um triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("É um triângulo Isósceles");
            } else {
                System.out.println("É um triângulo Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo!");
        }
    }
}
