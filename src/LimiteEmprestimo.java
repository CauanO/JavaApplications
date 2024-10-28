import java.util.Scanner;

public class LimiteEmprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario Bruto: ");
        int salarioBruto = sc.nextInt();
        System.out.println("Digite o valor do emprestimo: ");
        int valorPrestacao = sc.nextInt();
        if (valorPrestacao > ((salarioBruto * 30) / 100)) {
            System.out.println("Esse valor ultrapassa o seu limite!");
        } else {
            System.out.println("Sucesso!");
        }
    }
}
