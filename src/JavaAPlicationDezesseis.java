import java.util.Scanner;

public class JavaAPlicationDezeseis {
    public static void main(String[] args) {
        int anos, meses, dias, total;
        Scanner sc = new Scanner(System.in); // Entrada de dados
        System.out.println("Anos: ");
        anos = sc.nextInt();
        System.out.println("Meses: ");
        meses = sc.nextInt();
        System.out.println("Dias: ");
        dias = sc.nextInt();
        total = anos * 360 + meses * 30 + dias;
        System.out.println(total + " dias vividos.");
    }
}
