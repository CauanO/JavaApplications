import java.util.Scanner;

public class FaturamentoLocadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeFitas, valorAluguel, faturamentoAnual;
        double multa;

        quantidadeFitas = sc.nextInt();
        valorAluguel = sc.nextInt();
        quantidadeFitas = quantidadeFitas * valorAluguel;
        faturamentoAnual = (quantidadeFitas / 3) * 12;
        System.out.println("Faturamento anual: R$" + faturamentoAnual);
        multa = valorAluguel + ((quantidadeFitas / 3) * 0.1);
        System.out.printf("Faturamento por multas %f: ", multa);
    }
}
