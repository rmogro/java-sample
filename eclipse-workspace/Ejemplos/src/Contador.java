import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		// dada una lista de numeros enteros positivos, contar la cantidad de numeros pares
		
		Scanner teclado = new Scanner(System.in);	
		
		System.out.print("Ingrese el siguiente número: ");
		int x = teclado.nextInt();
		
		int contador = 0;  // definan e inicialicen la variable cuando es un contador
		
		while(x > 0) {
			if (x % 2 == 0) { // par
				contador = contador + 1; // contador++;
			}			
			System.out.print("Ingrese el siguiente número: ");
			x = teclado.nextInt();			
		}		
		
		System.out.println("En esta lista de números hay " + contador + " número/s par/es");		
	}

}
