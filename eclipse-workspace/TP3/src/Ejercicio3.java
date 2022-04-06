/**
 * 
 * @author René Mogro
 *
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Float> numeros = new ArrayList<Float>();
		for(int i = 0; i < 4; i++) { // el tamaño es 10
			System.out.println("Ingrese el siguiente número: ");
			float x = teclado.nextFloat(); 
			numeros.add(x);
		}
		
		System.out.println("Ingrese la posición del elemento a eliminar: ");
		int p = teclado.nextInt();
		
		if (p >= 0 && p <= numeros.size() - 1) {
			numeros.remove(p);
			System.out.println("Tamaño: " + numeros.size());
			for(int i = 0; i < numeros.size(); i++) {
				System.out.println(numeros.get(i));			
			}
		}
		else {
			System.out.println("La posición ingresada es incorrecta");
		}
	}

}
