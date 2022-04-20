import java.util.Scanner;

public class Ejercicio3 { // Aplicacion de tipo consola

	public static void main(String[] args) {
		NumeroEntero num1 = new NumeroEntero(60); // usar constructor por defecto
		int x = 20;
		NumeroEntero num2 = new NumeroEntero(x);
		
		System.out.println("Suma: " + num1.suma(num2));
		System.out.println("Resta: " + num1.resta(num2));
		System.out.println("Multiplicacion: " + num1.producto(num2));
		System.out.println("Division: " + num1.division(num2));
		
	}

}
