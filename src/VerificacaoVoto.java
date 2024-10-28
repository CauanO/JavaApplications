import java.util.Scanner;

public class VerificacaoVoto {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade < 18) {
            System.out.println("Voce não pode votar!");
        } else {
            System.out.println("Voce pode votar!");
        }
    }
}
