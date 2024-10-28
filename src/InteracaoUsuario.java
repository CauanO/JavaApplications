import java.util.Scanner;

public class ListOne {
    public static void main(String[] args) throws Exception {
        String nome;
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Oi, sou Computalino. E vc?");
        nome = sc.next();
        System.out.println("Bonito nome, " + nome + "!, Digite sua idade: ");
        n1 = sc.nextInt();
        System.out.println("Muito legal " + nome + "!, Voce tem " + n1 + " anos.");
    }
}
