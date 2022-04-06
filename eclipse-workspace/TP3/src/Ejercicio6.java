/**
 * 
 * @author René Mogro
 *
 */
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la palabra: ");
		String palabra = teclado.nextLine();
		String inversa = "";
		
		for(int i = palabra.length() - 1; i >= 0; i--) {			
			inversa += palabra.charAt(i);
		}
		
		System.out.println(inversa);
		
		if (palabra.equalsIgnoreCase(inversa)) {
			System.out.println("La palabra es palindromo");
		}
		else {
			System.out.println("La palabra no es palindromo");
		}
		
	}

}
