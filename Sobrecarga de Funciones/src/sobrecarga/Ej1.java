package sobrecarga;

import java.util.Scanner;

public class Ej1 {
	public static int suma(int n1, int n2) {
		int suma =n1 + n2;
		return suma;
	}
	
	public static double suma(double n1, double n2) {
		double suma =n1 + n2;
		return suma;
	}

	public static void main(String[] args) {
		double n1;
		double n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte el primer número: ");
		n1 = sc.nextDouble();
		System.out.print("Inserte el segundo número: ");
		n2 = sc.nextDouble();
		
		System.out.println((int) suma(n1, n1));
		System.out.println(suma(n1, n2));
		sc.close();

	}

}
