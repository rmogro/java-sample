import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		int n;		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese el número natural N: ");
		n = teclado.nextInt();
		
		int divisor = 1;
		int contador = 0;
		
		while(divisor <= n) {
			if(n % divisor == 0) {
				contador++;
			}
			divisor++;
		}
		
		if(contador == 2) {
			System.out.print("El número es primo");
		}
		else {
			System.out.print("El número no es primo");
		}
	}

}
