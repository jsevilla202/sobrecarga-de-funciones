package sobrecarga;

import java.util.Scanner;

public class Ej2 {

	public static double media(int n1, int n2) {
		double media = (double) (n1 + n2)/2;
		return  media;
	}
	
	public static double media(int n1, int n2, int n3) {
		double media = (double) (n1 + n2+ n3)/3;
		return media;
	}

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte el primer número: ");
		n1 = sc.nextInt();
		System.out.print("Inserte el segundo número: ");
		n2 = sc.nextInt();
		System.out.print("Inserte el tercer número: ");
		n3 = sc.nextInt();
		
		System.out.println(media(n1, n2));
		System.out.println(media(n1, n2, n3));
		sc.close();

	}

}
