import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {		
		float num1, num2, suma;
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("Ingrese el primer número: ");
		num1 = teclado.nextFloat();
		
		System.out.print("Ingrese el segundo número: ");
		num2 = teclado.nextFloat();
		
		suma =  num1 + num2;
	
		System.out.println("El resultado de la suma es: " + suma);
	}

}
