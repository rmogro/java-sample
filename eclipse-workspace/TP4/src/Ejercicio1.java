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
		
		Persona persona1 = new Persona();
		persona1.setNombre(nombre);
		persona1.setApellido(apellido);
		persona1.setDni(dni);
		persona1.setDomicilio(domicilio);
		
		persona1.mostarDatos();
		
		System.out.println("********************************");
		
		String nombreUpperCase =  persona1.getNombre().toUpperCase();
		System.out.println(nombreUpperCase);
		
		
		/*
		Persona objetoPersona = new Persona(nombre, apellido, dni, domicilio);
		objetoPersona.mostarDatos();		
		
		String domi = "Salta, Capital";
		Persona rene = new Persona("Rene", "Mogro", 29309633, domi);
		rene.mostarDatos();
		*/
	}

}
