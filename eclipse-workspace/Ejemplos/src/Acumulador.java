import java.util.Scanner;

public class Acumulador {

	public static void main(String[] args) {		
		int n;		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de n�meros: ");
		n = teclado.nextInt();
		
		int x;
		int acumulador = 0;
		for(int i = 1; i <= n; i++) {
			System.out.print("Ingrese el siguiente n�mero: ");
			x = teclado.nextInt();
			acumulador = acumulador + x;
		}		
		
		System.out.println("La suma de los " + n  + "n�meros es: " + acumulador);		
	}

}
