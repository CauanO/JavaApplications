import java.util.Scanner;

public class DuracaoProva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hInicio, mInicio, sInicio, totalInicio;
        int hFim, mFim, sFim, totalFim;
        int hora, minuto, segundo, diferenca;

        System.out.println("Digite o horario de entrada de sua prova: ");
        hInicio = sc.nextInt();
        mInicio = sc.nextInt();
        sInicio = sc.nextInt();
        System.out.println("Digite o horario de saida de sua prova: ");
        hFim = sc.nextInt();
        mFim = sc.nextInt();
        sFim = sc.nextInt();

        totalInicio = (hInicio*3600 + mInicio*60 + sInicio);
        totalFim = (hFim*3600 + mFim*60 + sFim);
        diferenca =  totalFim - totalInicio;
        hora = diferenca / 3600;
        minuto = (diferenca % 3600) / 60;
        segundo = diferenca % 60;

        System.out.printf("Horario de termino da prova: %d: %d: %d", hora, minuto, segundo);
    }
}
