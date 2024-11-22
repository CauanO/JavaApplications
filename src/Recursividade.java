package Java;

public class Recursividade {

	public static void main(String[] args) {
		System.out.println(fat(3));
		System.out.println(potencia(3, 2));
	}
	
	public static int fat(int n) {
		if (n > 0) {
			 return n*fat(n-1);
		}else {
			return 1;
		}
	}
	
	public static int potencia(int n, int x) {
		if (x==0) {
			 return 1;
		}
			return n*potencia(n, x - 1);
	}
}
