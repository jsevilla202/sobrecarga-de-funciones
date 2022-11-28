package sobrecarga;

import java.util.Scanner;

public class Ej4 {
	
	public static boolean parseToBoolean(int n) {
		if(n==1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean parseToBoolean(String string) {
		if(string.equals("true")) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		int n;
		String string;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte 0 o 1: ");
		n = sc.nextInt();
		System.out.print("Inserte true o false: ");
		string = sc.next();
		
		if(n==1||n==0) {
			System.out.println(parseToBoolean(n));
		}
		else {
			System.out.println("ERROR: El número insertado no es 1 o 0");
		}
		
		if(string.equals("true")||string.equals("false")) {
			System.out.println(parseToBoolean(string));
		}
		else {
			System.out.println("ERROR: Valor introducido no válido");
		}
		sc.close();

	}

}
