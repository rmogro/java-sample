/**
 * 
 * @author René Mogro
 *
 */
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[] numeros = new int[4]; // el tamaño es 10
		entradaDatos(numeros);
		salidaDatos(numeros);
	}
	
	public static void entradaDatos(int[] num) {
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < num.length; i++) {
			System.out.println("Ingrese el siguiente numero: ");
			num[i] = teclado.nextInt();
		}
	}
	
	public static void salidaDatos(int[] num) {
	
		for(int i = 0; i < num.length; i++) {
			System.out.println("Posicion: " + i);
			System.out.println("Valor: " + num[i]);
		}
	} 

}
