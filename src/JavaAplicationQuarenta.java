import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] vetor = new int[6];
        preecher(vetor);
        mostrar(vetor);
    }

    public static void preecher(int[] v) {
        Scanner sc = new Scanner(System.in);
        int n;
        int impar = 0, par = v.length / 2;
        while ((impar < v.length / 2) || (par < v.length)) {
            System.out.println("Digite o numero: ");
            n =sc.nextInt();
            if (n%2 == 0) {
                if (par<v.length) {
                    v[par] = n;
                    par++;
                }
            }else{
                if (impar<v.length/2) {
                    v[impar] = n;
                    impar++;
                }
            }
        }
    }
    public static void mostrar(int[] v){
       for (int i = 0; i < v.length; i++) {
        System.out.println(v[i] + " ");
       } 
       System.out.println();
    }
}
