import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		int n;		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de deportistas: ");
		n = teclado.nextInt();
		
		byte edad;
		int acumulador = 0;
		byte edadMenor = 127, edadMayor = -128;	
		
		for(int i = 1; i <= n; i++) {
			System.out.print("Ingrese la siguiente edad: ");
			edad = teclado.nextByte();
			//contador++; // no es necesario tengo la cantidad de edades en n
			acumulador += edad; // acumulador =  acumulador + edad;
			
			if(edad > edadMayor) {
				edadMayor = edad;
			}
			
			if(edad < edadMenor) {
				edadMenor = edad;
			}			
		}		
		
		float edadPromedio = (float) acumulador / n; // al dividir dos enteros el resultado de la division es entera, 		
		
		System.out.println("La edad promedio es: " + edadPromedio);		
		System.out.println("La edad menor es: " + edadMenor);
		System.out.println("La edad mayor es: " + edadMayor);
	}

}
