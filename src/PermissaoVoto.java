import java.util.Scanner;

public class PermissaoVoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade <= 15) {
            System.out.println("Sem permissão para votar!");
        } else if (idade <= 16 && idade <= 17 && idade < 65) {
            System.out.println("Voto facultativo!");
        } else if (idade >= 18 || idade < 65) {
            System.out.println("Voto obrigatório!");
        }
    }
}
