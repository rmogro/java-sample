import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		// dada una lista de numeros enteros positivos, contar la cantidad de numeros pares
		
		Scanner teclado = new Scanner(System.in);	
		
		System.out.print("Ingrese el siguiente n�mero: ");
		int x = teclado.nextInt();
		
		int contador = 0;  // definan e inicialicen la variable cuando es un contador
		
		while(x > 0) {
			if (x % 2 == 0) { // par
				contador = contador + 1; // contador++;
			}			
			System.out.print("Ingrese el siguiente n�mero: ");
			x = teclado.nextInt();			
		}		
		
		System.out.println("En esta lista de n�meros hay " + contador + " n�mero/s par/es");		
	}

}
