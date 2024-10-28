import java.util.Scanner;

public class CategoriaNadador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idadeNadador = sc.nextInt();
        if (idadeNadador >= 5 && idadeNadador <= 7) {
            System.out.println("Infantil A");
        } else if (idadeNadador >= 8 && idadeNadador <= 10) {
            System.out.println("Infantil B");
        } else if (idadeNadador >= 11 && idadeNadador <= 13) {
            System.out.println("Juvenil A");
        } else if (idadeNadador >= 14 && idadeNadador <= 17) {
            System.out.println("Juvenil B");
        } else {
            System.out.println("Sênior");
        }
    }
}
