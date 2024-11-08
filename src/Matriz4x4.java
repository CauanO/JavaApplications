package Java;

import java.util.Iterator;
import java.util.Scanner;

public class JavaAtividade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[4][4];
        preenche(a);
        mostra(a);
    }

    public static void preenche(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    a[i][j] = 0;
                } else if (i > j) {
                    a[i][j] = -1;
                } else {
                    a[i][j] = 1;
                }
            }
        }
    }

    public static void mostra(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
