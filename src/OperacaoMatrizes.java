package JavaApplication;

import java.util.Random;
import java.util.Scanner;

public class Revisao {

	public static void main(String[] args) {
		int a [][] = new int [2][3];
		int b [][] = new int [3][3];
		int c [][] = new int [2][3];
		preenche(a, b);
		opecacao(a, b, c);
		mostrar(a);
		System.out.println();
		mostrar(b);
		System.out.println();
		mostrar(c);
	}
	public static void preenche(int a[][], int b[][]) {
		//Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Preenchar a matriz 1: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Preenchar a matriz 2: ");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = sc.nextInt();
			}
		}
	}
	public static void mostrar(int c[][]) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public static void opecacao(int a[][], int b[][], int c [][]) {
		int soma = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				soma = 0;
				for (int j2 = 0; j2 < a[0].length; j2++) {
					soma += a[i][j2] * j2;
				}
				c[i][j] = soma;
			}
		}
	}
}
