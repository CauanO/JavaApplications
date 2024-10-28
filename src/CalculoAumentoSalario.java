import java.util.Scanner;

public class CalculoAumentoSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double novoSalario;
        System.out.println("Digite seu salário: ");
        double salario = sc.nextInt();
        System.out.println("Digite seu cargo: \n 101: Gerente \n 102: Engenheiro \n 103: Técnico");
        int cargo = sc.nextInt();
        switch (cargo) {
            case 101:
                novoSalario = salario + ((salario * 10) / 100);
                System.out.println("Salário com 10%: " + novoSalario);
                break;
            case 102:
                novoSalario = salario + ((salario * 20) / 100);
                System.out.println("Salário com 20%: " + novoSalario);
                break;
            case 103:
                novoSalario = salario + ((salario * 30) / 100);
                System.out.println("Salário com 30%: " + novoSalario);
                break;
            default:
                novoSalario = salario + ((salario * 40) / 100);
                System.out.println("Salário com 40%: " + novoSalario);
                break;
        }
    }
}
