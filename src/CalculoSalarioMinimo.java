import java.util.Scanner;

public class CalculoSalarioMinimo {
    public static void main(String[] args) {
        int salario, salarioMinimo = 1400, qtd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario: ");
        salario = sc.nextInt();
        qtd = salario / salarioMinimo;
        if (salario == salarioMinimo) {
            System.out.println(qtd + " salario minimo.");
        } else {
            System.out.println(qtd + " salarios minimos.");
        }
    }
}
