package sobrecarga;

import java.util.Scanner;

public class Ej1 {
	public static int suma(int n1, int n2) {
		int suma =n1 + n2;
		return suma;
	}
	
	public static double suma(double n1, double n2) {
		double suma = (double) n1 + n2;
		return suma;
	}

	public static void main(String[] args) {
		int n1;
		int n2;
		double n3;
		double n4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte el primer número entero: ");
		n1 = sc.nextInt();
		System.out.print("Inserte el segundo número entero: ");
		n2 = sc.nextInt();
		System.out.print("Inserte el primer número con decimales: ");
		n3 = sc.nextDouble();
		System.out.print("Inserte el segundo número con decimales: ");
		n4 = sc.nextDouble();
		
		System.out.println(suma(n1, n1));
		System.out.println(suma(n3, n4));
		sc.close();

	}

}
