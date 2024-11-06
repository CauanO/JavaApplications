import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
        int[][] n = new int[5][5];
        preenche(n);
        mostra(n);
    }
    public static void preenche(int[][] n) {
        Random r = new Random();
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = r.nextInt(10);
            }
        }
    }

    public static void mostra(int[][] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
            	System.out.print(n[i][j] + " "); 
            }
            System.out.println();
        }
    }
}

