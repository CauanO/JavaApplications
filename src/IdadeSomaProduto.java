import java.util.Scanner;

public class IdadeSomaProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade da mulher 1: ");
        int idadeHomem1 = sc.nextInt();
        System.out.println("Digite a idade da mulher 2: ");
        int idadeHomem2 = sc.nextInt();
        System.out.println("Digite a idade do homem 1: ");
        int idadeMulher1 = sc.nextInt();
        System.out.println("Digite a idade do homem 2: ");
        int idadeMulher2 = sc.nextInt();
        if (idadeHomem1 == idadeHomem2 && idadeMulher1 == idadeMulher2) {
            System.out.println("As idades não podem ser iguais!");
        } else if (idadeHomem1 > idadeHomem2 && idadeMulher1 > idadeMulher2) {
            int soma = idadeHomem1 +  idadeMulher2;
            int produto = idadeHomem2 + idadeMulher1;
            System.out.println("Soma: " + soma);
            System.out.println("Produto: " + produto);
        } else if (idadeHomem2 > idadeHomem1 && idadeMulher2 > idadeMulher1) {
            int soma = idadeHomem2 +  idadeMulher1;
            int produto = idadeHomem1 +  idadeMulher2;
            System.out.println("Soma: " + soma);
            System.out.println("Produto: " + produto);
        }
    }
}
