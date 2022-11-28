package sobrecarga;

import java.util.Scanner;

public class Ej5 {
	public static void numerosAleatorios (int cantidad) {
		for(int i = 1; i<=cantidad;i++) {
			int numero = (int) (Math.random()*100);
			System.out.println(numero);
		}
	}
	
	public static void numerosAleatorios (int cantidad, int valor) {
		for(int i = 1; i<=cantidad;i++) {
			int numero = (int) (Math.random()*(valor+1));
			System.out.println(numero);
		}
	}
	
	public static void numerosAleatorios (int cantidad, int valorminimo, int valormaximo) {
		for(int i = 1; i<=cantidad;i++) {
			int numero = (int) (Math.random()*(valormaximo-valorminimo)+valorminimo);
			System.out.println(numero);
		}
	}

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		int menu;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Qué acción desea realizar?\n 1. Recibir n números aleatorios\n 2. Recibir n números aleatorios con un valor máximo\n 3. Recibir n números aleatorios con un máximo y un mínimo");
		System.out.print("Inserte aquí su respuesta: ");
		menu =sc.nextInt();
		
		if(menu>=1&&menu<=3) {
			if(menu==1) {
				System.out.print("Inserte la cantidad de números a generar: ");
				n1 = sc.nextInt();
				numerosAleatorios(n1);
			}
			else if(menu==2) {
				System.out.print("Inserte la cantidad de números a generar: ");
				n1 = sc.nextInt();
				System.out.print("Inserte el valor máximo de los números aleatorios: ");
				n2 = sc.nextInt();
				numerosAleatorios(n1, n2);
			}
			else {
				System.out.print("Inserte la cantidad de números a generar: ");
				n1 = sc.nextInt();
				System.out.print("Inserte el valor máximo de los números aleatorios: ");
				n2 = sc.nextInt();
				n2++;
				System.out.print("Inserte el valor mínimo de los números aleatorios: ");
				n3 = sc.nextInt();
				numerosAleatorios(n1, n2, n3);
			}
		}
		else {
			System.out.println("ERROR: Valor introducido incorrecto");
		}
		sc.close();

	}

}
