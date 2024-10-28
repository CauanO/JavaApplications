import java.util.Scanner;

public class PoligonoPerimetroArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de lado do polígono: ");
        int qtd = sc.nextInt();
        if (qtd == 3) {
            System.out.println("Digite o primeiro valor: ");
            int lado1 = sc.nextInt();
            System.out.println("Digite o segundo valor: ");
            int lado2 = sc.nextInt();
            System.out.println("Digite o terceiro valor: ");
            int lado3 = sc.nextInt();
            int total = lado1 + lado2 + lado3;
            System.out.println("Valor do perímetro de seu Triângulo: " + total);
        } else if (qtd == 4) {
            System.out.println("Digite o valor da altura: ");
            int altura = sc.nextInt();
            System.out.println("Digite o valor da base: ");
            int base = sc.nextInt();
            int total = altura * base;
            System.out.println("Valor da Área de seu Quadrado: " + total);
        } else {
            System.out.println("PENTÁGONO");
        }
    }
}
