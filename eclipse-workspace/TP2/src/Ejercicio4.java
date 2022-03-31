import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// ejemplo de como validar una division por cero
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese num1: ");
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese num2: ");
		num2 = teclado.nextInt();
		
		if(num2 != 0) {
			int div =  num1/num2;
			System.out.println(div);
		}
		else {
			System.out.println("Error!!!!!!");
		}
	}

}
