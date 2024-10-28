import java.util.Scanner;

public class SegundosDesdeOMeioDia {
    public static void main(String[] args) {
        int hr, min, seg, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora atual: ");
        hr = sc.nextInt();
        System.out.println("Digite o min atual: ");
        min = sc.nextInt();
        System.out.println("Digite o segundo atual: ");
        seg = sc.nextInt();
        total = hr*3600 + min*60 + seg;
        System.out.println("Segundos passados: " + total);
    }
}
