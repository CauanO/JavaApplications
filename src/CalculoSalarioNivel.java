import java.util.Scanner;

public class CalculoSalarioNivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nivel, hr, total;
        System.out.println("Digite seu nível: ");
        nivel = sc.nextInt();
        System.out.println("Digite as horas trabalhadas: ");
        hr = sc.nextInt();
        switch (nivel) {
            case 1:
                total = hr * 12;
                System.out.println("Valor: " + total);
                break;
            case 2:
                total = hr * 17;
                System.out.println("Valor: " + total);
                break;
            case 3:
                total = hr * 25;
                System.out.println("Valor: " + total);
                break;
            default:
                System.out.println("Nível inválido");
                break;
        }
    }
}
