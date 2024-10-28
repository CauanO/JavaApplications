import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        int n1, n2, n3;
        int p1, p2, p3;
        int media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite nota 1: ");
        n1 = sc.nextInt();
        System.out.println("Digite nota 2: ");
        n2 = sc.nextInt();
        System.out.println("Digite nota 3: ");
        n3 = sc.nextInt();
        System.out.println("Digite peso 1: ");
        p1 = sc.nextInt();
        System.out.println("Digite peso 2: ");
        p2 = sc.nextInt();
        System.out.println("Digite peso 3: ");
        p3 = sc.nextInt();
        media = (n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3); 
        System.out.println("Media: " + media);
    }
}
