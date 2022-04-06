/**
 * 
 * @author René Mogro
 *
 */
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio4 {

	public static void main(String[] args) {	
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Random random = new Random();
		for(int i = 0; i < 4; i++) { // el tamaño es 20			
			int x = random.nextInt(100) + 1; // 0 y 99 + 1
			numeros.add(x);
		}		
		
		// resolucion a medias...
		
		for(int i = 0; i < 4; i++) {
			System.out.println(numeros.get(i));			
		}
		
	}

}
