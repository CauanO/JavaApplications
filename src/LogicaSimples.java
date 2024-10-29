import java.util.Scanner;

public class LogicaDoDhabo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n = sc.nextInt();
        logica(n);
        
    }
    public static void logica(int a){
        for (int i = 1; i < a; i++) {
            int soma = i + 1;
            System.out.println(i + " + " + "1");
        }
    }
}
