import java.util.Scanner;

public class NombreEdad {

	public static void main(String[] args) {		
		int edad;
		String nombre;
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("Ingrese su nombre: ");
		nombre = teclado.nextLine();
		
		System.out.print("Ingrese su edad: ");
		edad = teclado.nextInt();
		
		if(edad >= 18)
		{
			System.out.println(nombre + ", Ud SI tiene permitido el ingreso al salón.");
		}
		else {
			System.out.println(nombre + ", Ud NO tiene permitido el ingreso al salón.");
		}		
	
		System.out.println("Hasta Pronto!!!");
	}

}
