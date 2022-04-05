//import java.util.ArrayList;
import java.util.Scanner;

public class Clase042 {

	public static void main(String[] args) {
		int[] numeros = new int[5];
		Scanner teclado = new Scanner(System.in);
		
		// entrada
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese el siguiente numero: ");
			numeros[i] = teclado.nextInt();
		}
		
		// salida
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Posicion: " + i);
			System.out.println("Valor: " + numeros[i]);
		}
	}
}
