package sobrecarga;

import java.util.Scanner;

public class Ej3 {
	public static int sumaEnteros(int n1) {
		int suma = 0;
		for(int i = 1; i<=n1;i++) {
			suma = suma + i;
		}
		return suma;
	}
	
	public static int sumaEnteros(int n1, int n2) {
		int suma = 0;
		for(int i = n1; i<=n2;i++) {
			suma = suma + i;
		}
		return suma;
	}

	public static void main(String[] args) {
		int n1;
		int n2;
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte el primer número: ");
		n1 = sc.nextInt();
		System.out.print("Inserte el segundo número: ");
		n2 = sc.nextInt();
		
		if(n1<n2) {
		System.out.println(sumaEnteros(n1));
		System.out.println(sumaEnteros(n1, n2));
		}
		else {
			System.out.println(sumaEnteros(n2));
			System.out.println(sumaEnteros(n2, n1));
		}
		sc.close();

	}

}
