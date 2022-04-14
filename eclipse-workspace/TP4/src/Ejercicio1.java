import java.util.Scanner;

public class Ejercicio1 { // Aplicacion de tipo consola

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println("Ingrese su apellido: ");
		String apellido = teclado.nextLine();
		
		System.out.println("Ingrese su domicilio: ");
		String domicilio = teclado.nextLine();
		
		System.out.println("Ingrese su dni: ");
		int dni = teclado.nextInt();	
		
		Persona objetoPersona = new Persona(nombre, apellido, dni, domicilio);
		objetoPersona.mostarDatos();		
		
		Persona rene = new Persona("Rene", "Mogro", 29309633, "Salta");
		rene.mostarDatos();
	}

}
