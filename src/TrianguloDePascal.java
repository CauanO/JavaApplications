package Java;

import java.util.Scanner;

public class TrianguloDePascal {

	public static void main(String[] args) {
		int l, c, n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da matriz: ");
		l = sc.nextInt();
		c = sc.nextInt();

		int a[][] = new int[l][c];
		int cont = 0;

		a[0][0] = 1;
		if (l > 1)
			a[1][0] = 1;
		if (l > 1)
			a[1][1] = 1;

		for (int i = 2; i < l; i++) {
			a[i][0] = 1;
			for (int j = 1; j < i; j++) {
				a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
				if (a[i][j] % 2 == 0) {
					cont++;
				}
			}
			a[i][i] = 1;
		}
		for (int i = 0; i < l; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
