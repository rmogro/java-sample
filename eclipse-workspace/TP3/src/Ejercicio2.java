/**
 * 
 * @author René Mogro
 *
 */
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float[] pesos = new float[4]; // el tamaño es 20
		float menor = 0, mayor = 0, acumulador = 0;
		boolean existe = false;
		for(int i = 0; i < pesos.length; i++) {
			System.out.println("Ingrese el siguiente peso: ");
			pesos[i] = teclado.nextFloat();
			
			if(i == 0) {
				menor = pesos[0];
				mayor = pesos[0];
			}
			else {
				if(pesos[i] < menor) {
					menor = pesos[i];					
				}				
				
				if(pesos[i] > mayor) {					
					mayor = pesos[i];
				}
			}			
			
			acumulador += pesos[i];
		}
		
		if(mayor > 100) {					
			existe = true;
		}
		
		float medio = acumulador / pesos.length;
		System.out.println("Peso menor: " + menor);
		System.out.println("Peso mayor: " + mayor);
		System.out.println("Peso medio: " + medio);
		System.out.println(existe ? "Si existe una persona con un peso mayor a 100 kg" : "No Existe una persona con un peso mayor a 100 kg");

	}

}
