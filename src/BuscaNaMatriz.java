import java.util.Random;
import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] n = new int[5][5];
        int b = sc.nextInt();
        preenche(n);
        mostra(n, b);
    }

    public static void preenche(int[][] n) {
        Random r = new Random();
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = r.nextInt(10);
            }
        }
    }

    public static void mostra(int[][] n, int b) {
        int cont = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
                if (b == n[i][j]) {
                    cont++;
                }
            }
            System.out.println();
        }
        System.out.println("Numero: " + b + "\nQuantidade: " + cont);
    }
}
