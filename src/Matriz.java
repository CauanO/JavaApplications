public class App {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        preench(a);
        mostra(a);
    }

    public static void preench(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = j % 2;
            }
        }
    }

    public static void mostra(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
