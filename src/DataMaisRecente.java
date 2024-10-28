import java.util.Scanner;

public class DataMaisRecente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia1 = sc.nextInt();
        int mes1 = sc.nextInt();
        int ano1 = sc.nextInt();

        int dia2 = sc.nextInt();
        int mes2 = sc.nextInt();
        int ano2 = sc.nextInt();

        if (ano1 > ano2 || (ano1 == ano2 && mes1 > mes2 || dia1 > dia2)) {
            System.out.printf("Data mais recente: %d / %d / %d ", dia1, mes1, ano1);
        } else {
            System.out.printf("Data mais recente: %d / %d / %d ", dia2, mes2, ano2);
        }
    }
}
